package utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 8/19/16.
 */
public class GraphNodeForTopologicalSort<T> extends GraphNode<T> {
    public int incoming;
    public GraphNodeState state;
    public List<GraphNodeForTopologicalSort<T>> adjacent;

    public GraphNodeForTopologicalSort(T data) {
        super(data);
        incoming = 0;
        state = GraphNodeState.Unvisited;
        adjacent = new LinkedList<>();
    }

    public void setAdjacent(GraphNodeForTopologicalSort<T> other) {
        adjacent.add(other);
    }
}