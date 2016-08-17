package q1_route_between_nodes;

import utils.GraphNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jjlee on 8/17/16.
 */
public class Question {
    /* search from source to destination using DFS */
    public <T> boolean searchDFS(GraphNode<T> s, GraphNode<T> t) {
        HashSet<GraphNode<T>> visited = new HashSet<>();
        return dfs(s, t, visited);
    }

    private <T> boolean dfs(GraphNode<T> s, GraphNode<T> t, HashSet<GraphNode<T>> visited) {
        if (s == t) return true;
        visited.add(s);
        for (GraphNode<T> adj : s.adjacent) {
            if (!visited.contains(adj) && dfs(adj, t, visited)) return true;
        }
        return false;
    }

    /* search from source to destination using BFS */
    public <T> boolean searchBFS(GraphNode<T> s, GraphNode<T> t) {
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
}
