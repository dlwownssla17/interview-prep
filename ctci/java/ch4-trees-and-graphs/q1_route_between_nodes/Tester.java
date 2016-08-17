package q1_route_between_nodes;

import org.testng.annotations.*;
import utils.Graph;
import utils.GraphNodeWithIncoming;

import static org.testng.Assert.*;
import static q1_route_between_nodes.Question.*;

/**
 * Created by jjlee on 8/17/16.
 */
public class Tester {
    Graph<Integer> g;
    GraphNodeWithIncoming<Integer> n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;

    @BeforeMethod
    public void setup() throws Exception {
        g = new Graph<>();
        n0 = new GraphNodeWithIncoming<>(0);
        n1 = new GraphNodeWithIncoming<>(1);
        n2 = new GraphNodeWithIncoming<>(2);
        n3 = new GraphNodeWithIncoming<>(3);
        n4 = new GraphNodeWithIncoming<>(4);
        n5 = new GraphNodeWithIncoming<>(5);
        n6 = new GraphNodeWithIncoming<>(6);
        n7 = new GraphNodeWithIncoming<>(7);
        n8 = new GraphNodeWithIncoming<>(8);
        n9 = new GraphNodeWithIncoming<>(9);
        n0.setAdjacent(n1);
        n0.setAdjacent(n3);
        n1.setAdjacent(n2);
        n1.setAdjacent(n3);
        n2.setAdjacent(n3);
        n3.setAdjacent(n0);
        n3.setAdjacent(n2);
        n3.setAdjacent(n4);
        n4.setAdjacent(n0);
        n4.setAdjacent(n5);
        n6.setAdjacent(n8);
        n7.setAdjacent(n6);
        n8.setAdjacent(n1);
        n8.setAdjacent(n7);
        n9.setAdjacent(n9);
    }

    @Test
    public void testSearchDFS() throws Exception {
        assertTrue(searchDFS(n0, n1));
        assertTrue(searchDFS(n1, n0));
        assertTrue(searchDFS(n0, n5));
        assertTrue(searchDFS(n4, n2));
        assertTrue(searchDFS(n0, n0));
        assertTrue(searchDFS(n7, n8));
        assertTrue(searchDFS(n6, n3));
        assertFalse(searchDFS(n5, n0));
        assertFalse(searchDFS(n0, n8));
        assertFalse(searchDFS(n9, n7));
    }

    @Test
    public void testSearchBFS() throws Exception {
        assertTrue(searchBFS(n0, n1));
        assertTrue(searchBFS(n1, n0));
        assertTrue(searchBFS(n0, n5));
        assertTrue(searchBFS(n4, n2));
        assertTrue(searchBFS(n0, n0));
        assertTrue(searchBFS(n7, n8));
        assertTrue(searchBFS(n6, n3));
        assertFalse(searchBFS(n5, n0));
        assertFalse(searchBFS(n0, n8));
        assertFalse(searchBFS(n9, n7));
    }

    @Test
    public void testSearchBidirectionalSearch() throws Exception {
        assertTrue(searchBidirectionalSearch(n0, n1));
        assertTrue(searchBidirectionalSearch(n1, n0));
        assertTrue(searchBidirectionalSearch(n0, n5));
        assertTrue(searchBidirectionalSearch(n4, n2));
        assertTrue(searchBidirectionalSearch(n0, n0));
        assertTrue(searchBidirectionalSearch(n7, n8));
        assertTrue(searchBidirectionalSearch(n6, n3));
        assertFalse(searchBidirectionalSearch(n5, n0));
        assertFalse(searchBidirectionalSearch(n0, n8));
        assertFalse(searchBidirectionalSearch(n9, n7));
    }

}