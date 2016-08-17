package q1_route_between_nodes;

import utils.GraphNode;
import utils.GraphNodeWithIncoming;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jjlee on 8/17/16.
 */
public class Question {
    /* search from source to destination using DFS */
    public static <T> boolean searchDFS(GraphNode<T> s, GraphNode<T> t) {
        HashSet<GraphNode<T>> visited = new HashSet<>();
        return dfs(s, t, visited);
    }

    /* recursive helper function to perform DFS */
    private static <T> boolean dfs(GraphNode<T> s, GraphNode<T> t, HashSet<GraphNode<T>> visited) {
        if (s == t) return true;
        visited.add(s);
        for (GraphNode<T> adj : s.adjacent) {
            if (!visited.contains(adj) && dfs(adj, t, visited)) return true;
        }
        return false;
    }

    /* search from source to destination using BFS */
    public static <T> boolean searchBFS(GraphNode<T> s, GraphNode<T> t) {
        HashSet<GraphNode<T>> visited = new HashSet<>();
        Queue<GraphNode<T>> q = new LinkedList<>();
        q.add(s);
        while (!q.isEmpty()) {
            GraphNode<T> current = q.remove();
            if (current == t) return true;
            visited.add(current);
            for (GraphNode<T> adj : current.adjacent) {
                if (!visited.contains(adj)) q.add(adj);
            }
        }
        return false;
    }

    /* search from source to destination using bidirectional search */
    public static <T> boolean searchBidirectionalSearch(GraphNodeWithIncoming<T> s, GraphNodeWithIncoming<T> t) {
        HashSet<GraphNodeWithIncoming<T>> visitedFromS = new HashSet<>();
        HashSet<GraphNodeWithIncoming<T>> visitedFromT = new HashSet<>();
        Queue<GraphNodeWithIncoming<T>> qFromS = new LinkedList<>();
        Queue<GraphNodeWithIncoming<T>> qFromT = new LinkedList<>();
        qFromS.add(s);
        qFromT.add(t);
        while (!qFromS.isEmpty() && !qFromT.isEmpty()) {
            GraphNodeWithIncoming<T> currentFromS = qFromS.remove();
            GraphNodeWithIncoming<T> currentFromT = qFromT.remove();
            if (currentFromS == currentFromT) return true;
            visitedFromS.add(currentFromS);
            visitedFromT.add(currentFromT);
            for (GraphNode<T> adj : currentFromS.adjacent) {
                GraphNodeWithIncoming<T> out = (GraphNodeWithIncoming <T>) adj;
                if (visitedFromT.contains(out)) return true;
                if (!visitedFromS.contains(out)) qFromS.add(out);
            }
            for (GraphNodeWithIncoming<T> in : currentFromT.incoming) {
                if (visitedFromS.contains(in)) return true;
                if (!visitedFromT.contains(in)) qFromT.add(in);
            }
        }
        return false;
    }
}
