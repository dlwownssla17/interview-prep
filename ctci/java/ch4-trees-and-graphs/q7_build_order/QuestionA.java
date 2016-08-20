package q7_build_order;

import utils.GraphNode;
import utils.GraphNodeForTopologicalSort;

import java.util.*;

/**
 * Created by jjlee on 8/19/16.
 */
public class QuestionA {

    public static String[] buildOrder(String[] projects, String[][] dependencies) {
        HashMap<String, GraphNodeForTopologicalSort<String>> allNodes = createAllNodes(projects);
        Queue<GraphNodeForTopologicalSort<String>> nodesWithNoIncoming = getAllNodesWithNoIncoming(allNodes, dependencies);
        String[] order = new String[projects.length];
        return processNodesWithNoIncoming(nodesWithNoIncoming, order);
    }

    private static HashMap<String, GraphNodeForTopologicalSort<String>> createAllNodes(String[] projects) {
        HashMap<String, GraphNodeForTopologicalSort<String>> allNodes = new HashMap<>();
        for (String s : projects) {
            allNodes.put(s, new GraphNodeForTopologicalSort<>(s));
        }
        return allNodes;
    }

    private static Queue<GraphNodeForTopologicalSort<String>> getAllNodesWithNoIncoming
            (HashMap<String, GraphNodeForTopologicalSort<String>> allNodes, String[][] dependencies) {
        for (String[] dependency : dependencies) {
            GraphNodeForTopologicalSort<String> depending = allNodes.get(dependency[0]);
            GraphNodeForTopologicalSort<String> depended = allNodes.get(dependency[1]);
            depending.incoming++;
            depended.setAdjacent(depending);
        }
        Queue<GraphNodeForTopologicalSort<String>> nodesWithNoIncoming = new LinkedList<>();
        for (String s : allNodes.keySet()) {
            GraphNodeForTopologicalSort<String> node = allNodes.get(s);
            if (node.incoming == 0) nodesWithNoIncoming.add(node);
        }
        return nodesWithNoIncoming;
    }

    private static String[] processNodesWithNoIncoming(Queue<GraphNodeForTopologicalSort<String>> nodesWithNoIncoming,
                                                   String[] order) {
        int processed = 0;
        while (!nodesWithNoIncoming.isEmpty()) {
            GraphNodeForTopologicalSort<String> node = nodesWithNoIncoming.remove();
            for (GraphNodeForTopologicalSort<String> adj : node.adjacent) {
                adj.incoming--;
                if (adj.incoming == 0) nodesWithNoIncoming.add(adj);
            }
            order[processed++] = node.data;
        }
        return processed == order.length ? order : null;
    }
}
