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
        bst.insert(0);
        bst.insert(-5);
        bst.insert(-8);
        bst.insert(7);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        bst.insert(2);
        bst.insert(1);
        bst.insert(0);
        bst.insert(0);
        bst.insert(10);
        bst.insert(12);
        bst.insert(8);
        bst.insert(9);
        bst.insert(8);
        bst.insert(11);
        assertEquals(bst.size(), 17);
        assertEquals(bst.inOrderTraversal(), "-8-5000122347889101112");
        assertEquals((int) bst.find(0).data, 0);
        assertEquals((int) bst.find(10).data, 10);
        assertEquals((int) bst.find(-8).data, -8);
        assertEquals((int) bst.find(8).data, 8);
        assertNull(bst.find(5));
        assertFalse(bst.delete(6));
        assertFalse(bst.delete(13));
        printRandomNodes(bst.size());
        assertTrue(bst.delete(-8));
        assertTrue(bst.delete(12));
        assertTrue(bst.delete(8));
        assertTrue(bst.delete(0));
        assertTrue(bst.delete(0));
        assertTrue(bst.delete(0));
        assertFalse(bst.delete(0));
        assertEquals(bst.size(), 11);
        assertEquals(bst.inOrderTraversal(), "-5122347891011");
        printRandomNodes(bst.size());
        assertEquals((int) bst.find(11).data, 11);
        assertTrue(bst.delete(11));
        assertTrue(bst.delete(10));
        assertTrue(bst.delete(-5));
        assertTrue(bst.delete(2));
        assertTrue(bst.delete(2));
        assertTrue(bst.delete(9));
        assertEquals(bst.size(), 5);
        assertEquals(bst.inOrderTraversal(), "13478");
        printRandomNodes(bst.size());
        bst.insert(5);
        bst.insert(6);
        bst.insert(2);
        bst.insert(9);
        bst.insert(0);
        assertEquals(bst.size(), 10);
        assertEquals(bst.inOrderTraversal(), "0123456789");
        printRandomNodes(bst.size());
        assertTrue(bst.delete(9));
        assertTrue(bst.delete(8));
        assertTrue(bst.delete(7));
        assertTrue(bst.delete(6));
        assertTrue(bst.delete(5));
        assertTrue(bst.delete(4));
        assertTrue(bst.delete(3));
        assertTrue(bst.delete(2));
        assertEquals(bst.size(), 2);
        assertEquals(bst.inOrderTraversal(), "01");
        printRandomNodes(10);
        assertTrue(bst.delete(0));
        assertFalse(bst.delete(0));
        assertEquals(bst.size(), 1);
        assertEquals(bst.inOrderTraversal(), "1");
        printRandomNodes(10);
        assertTrue(bst.delete(1));
        assertFalse(bst.delete(2));
        assertEquals(bst.size(), 0);
        assertEquals(bst.inOrderTraversal(), "");
        assertNull(bst.getRandomNode());
    }

    private void printRandomNodes(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(bst.getRandomNode().data.toString());
        }
        System.out.println("---");
    }
}