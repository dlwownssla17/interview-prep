package utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 8/17/16.
 */
public class GraphNode<T> {
    public T data;
    public List<GraphNode<T>> adjacent;

    public GraphNode(T data) {
        this.data = data;
        adjacent = new LinkedList<>();
    }

    public void setAdjacent(GraphNode<T> other) {
        adjacent.add(other);
    }
}
