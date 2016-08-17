package utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 8/17/16.
 */
public class GraphNodeWithIncoming<T> extends GraphNode<T> {
    public List<GraphNodeWithIncoming<T>> incoming;

    public GraphNodeWithIncoming(T data) {
        super(data);
        incoming = new LinkedList<>();
    }

    public void setAdjacent(GraphNodeWithIncoming<T> other) {
        adjacent.add(other);
        other.incoming.add(this);
    }
}
