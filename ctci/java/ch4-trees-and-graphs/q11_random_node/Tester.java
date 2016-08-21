package q11_random_node;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/21/16.
 */
public class Tester {
    BSTWithGetRandomNode<Integer> bst;

    @BeforeMethod
    public void setup() throws Exception {
        bst = new BSTWithGetRandomNode<>();
    }

    @Test
    public void testBSTWithGetRandomNode() throws Exception {
        assertEquals(bst.size(), 0);
        assertEquals(bst.inOrderTraversal(), "");
        assertNull(bst.find(0));
        assertFalse(bst.delete(0));
        bst.insert(0);
        assertEquals(bst.size(), 1);
        assertEquals(bst.inOrderTraversal(), "0");
        assertEquals((int) bst.find(0).data, 0);
        assertTrue(bst.delete(0));
        assertEquals(bst.size(), 0);
        assertEquals(bst.inOrderTraversal(), "");

    }
}