package q7_build_order;

import utils.GraphNodeForTopologicalSort;
import utils.GraphNodeState;

import java.util.*;

/**
 * Created by jjlee on 8/19/16.
 */
public class QuestionB {
    /* find a valid build order given projects and their dependencies by using topological sort with DFS */
    public static String[] buildOrderTopologicalSort(String[] projects, String[][] dependencies) {
        HashMap<String, GraphNodeForTopologicalSort<String>> allNodes = createAllNodes(projects);
        addDependencies(allNodes, dependencies);
        return processWithTopologicalSort(allNodes, new Stack<>());
    }

    /* create the graph nodes for all the projects */
    private static HashMap<String, GraphNodeForTopologicalSort<String>> createAllNodes(String[] projects) {
        HashMap<String, GraphNodeForTopologicalSort<String>> allNodes = new HashMap<>();
        for (String s : projects) {
            allNodes.put(s, new GraphNodeForTopologicalSort<>(s));
        }
        return allNodes;
    }

    /* connect the nodes according to their dependencies */
    private static void addDependencies(HashMap<String, GraphNodeForTopologicalSort<String>> allNodes,
                                        String[][] dependencies) {
        for (String[] dependency : dependencies) {
            GraphNodeForTopologicalSort<String> depending = allNodes.get(dependency[0]);
            GraphNodeForTopologicalSort<String> depended = allNodes.get(dependency[1]);
            depended.setAdjacent(depending);
        }
    }

    /* iterate over all nodes for topological sort */
    private static String[] processWithTopologicalSort(HashMap<String, GraphNodeForTopologicalSort<String>> allNodes,
                                                       Stack<String> orderStack) {
        for (String s : allNodes.keySet()) {
            GraphNodeForTopologicalSort<String> node = allNodes.get(s);
            if (node.state == GraphNodeState.Unvisited && !topologicalSortWithDFS(node, orderStack)) return null;
        }
        String[] order = new String[allNodes.size()];
        int orderIndex = 0;
        while (!orderStack.isEmpty()) {
            order[orderIndex++] = orderStack.pop();
        }
        return order;
    }

    /* apply DFS for topological sort */
    private static boolean topologicalSortWithDFS(GraphNodeForTopologicalSort<String> n, Stack<String> orderStack) {
        n.state = GraphNodeState.Visiting;
        for (GraphNodeForTopologicalSort<String> adj : n.adjacent) {
            if (adj.state == GraphNodeState.Visiting ||
                    (adj.state != GraphNodeState.Visited && !topologicalSortWithDFS(adj, orderStack))) return false;
        }
        orderStack.push(n.data);
        n.state = GraphNodeState.Visited;
        return true;
    }
}
