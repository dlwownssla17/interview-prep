package utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 8/17/16.
 */
public class Graph<T> {
    public List<GraphNode<T>> nodes;

    public Graph() {
        nodes = new LinkedList<>();
    }
}
