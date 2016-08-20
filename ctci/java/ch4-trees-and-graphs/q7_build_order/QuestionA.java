package q7_build_order;

import utils.GraphNode;
import utils.GraphNodeForTopologicalSort;

import java.util.*;

/**
 * Created by jjlee on 8/19/16.
 */
public class QuestionA {
    /* find a valid build order given projects and their dependencies by continuing to process projects with no
       dependency */
    public static String[] buildOrder(String[] projects, String[][] dependencies) {
        HashMap<String, GraphNodeForTopologicalSort<String>> allNodes = createAllNodes(projects);
        Queue<GraphNodeForTopologicalSort<String>> nodesWithNoIncoming =
                getAllNodesWithNoIncoming(allNodes, dependencies);
        return processNodesWithNoIncoming(nodesWithNoIncoming, projects.length);
    }

    /* create the graph nodes for all the projects */
    private static HashMap<String, GraphNodeForTopologicalSort<String>> createAllNodes(String[] projects) {
        HashMap<String, GraphNodeForTopologicalSort<String>> allNodes = new HashMap<>();
        for (String s : projects) {
            allNodes.put(s, new GraphNodeForTopologicalSort<>(s));
        }
        return allNodes;
    }

    /* find nodes with no incoming edges and connect nodes according to their dependencies */
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

    /* continue processing nodes with no incoming edges until none left */
    private static String[] processNodesWithNoIncoming(Queue<GraphNodeForTopologicalSort<String>> nodesWithNoIncoming,
                                                   int numProjects) {
        String[] order = new String[numProjects];
        int processed = 0;
        while (!nodesWithNoIncoming.isEmpty()) {
            GraphNodeForTopologicalSort<String> node = nodesWithNoIncoming.remove();
            for (GraphNodeForTopologicalSort<String> adj : node.adjacent) {
                adj.incoming--;
                if (adj.incoming == 0) nodesWithNoIncoming.add(adj);
            }
            order[processed++] = node.data;
        }
        return processed == numProjects ? order : null;
    }
}
