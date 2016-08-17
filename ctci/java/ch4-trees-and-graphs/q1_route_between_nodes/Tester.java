package q1_route_between_nodes;

import org.testng.annotations.*;
import utils.Graph;
import utils.GraphNode;

/**
 * Created by jjlee on 8/17/16.
 */
public class Tester {
    Graph<Integer> g;
    GraphNode<Integer> n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;

    @BeforeMethod
    public void setup() throws Exception {
        g = new Graph<>();
        n0 = new GraphNode<>(0);
        n1 = new GraphNode<>(1);
        n2 = new GraphNode<>(2);
        n3 = new GraphNode<>(3);
        n4 = new GraphNode<>(4);
        n5 = new GraphNode<>(5);
        n6 = new GraphNode<>(6);
        n7 = new GraphNode<>(7);
        n8 = new GraphNode<>(8);
        n9 = new GraphNode<>(9);
        n0.adjacent.add(n1);

    }

    @Test
    public void testSearchDFS() throws Exception {

    }

    @Test
    public void testSearchBFS() throws Exception {

    }

}