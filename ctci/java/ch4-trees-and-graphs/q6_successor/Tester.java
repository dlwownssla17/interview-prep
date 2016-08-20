package q6_successor;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNodeWithParent;

import static org.testng.Assert.*;
import static q6_successor.Question.*;

/**
 * Created by jjlee on 8/19/16.
 */
public class Tester {
    BinaryTreeNodeWithParent<Integer> a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;

    @BeforeMethod
    public void setup() throws Exception {
        a0 = new BinaryTreeNodeWithParent<>(0);
        a1 = new BinaryTreeNodeWithParent<>(1);
        a2 = new BinaryTreeNodeWithParent<>(2);
        a3 = new BinaryTreeNodeWithParent<>(3);
        a4 = new BinaryTreeNodeWithParent<>(4);
        a5 = new BinaryTreeNodeWithParent<>(5);
        a6 = new BinaryTreeNodeWithParent<>(6);
        a7 = new BinaryTreeNodeWithParent<>(7);
        a8 = new BinaryTreeNodeWithParent<>(8);
        a9 = new BinaryTreeNodeWithParent<>(9);
        a10 = new BinaryTreeNodeWithParent<>(10);
        a11 = new BinaryTreeNodeWithParent<>(11);
        a12 = new BinaryTreeNodeWithParent<>(12);
        a0.setRight(a7);
        a7.setLeft(a4);
        a7.setRight(a10);
        a4.setLeft(a1);
        a4.setRight(a5);
        a10.setLeft(a9);
        a10.setRight(a11);
        a1.setRight(a3);
        a5.setRight(a6);
        a9.setLeft(a8);
        a11.setRight(a12);
        a3.setLeft(a2);
    }

    @Test
    public void testInOrderSuccessor() throws Exception {
        assertNull(inOrderSuccessor(null));
        assertEquals(inOrderSuccessor(a0), a1);
        assertEquals(inOrderSuccessor(a1), a2);
        assertEquals(inOrderSuccessor(a2), a3);
        assertEquals(inOrderSuccessor(a3), a4);
        assertEquals(inOrderSuccessor(a4), a5);
        assertEquals(inOrderSuccessor(a5), a6);
        assertEquals(inOrderSuccessor(a6), a7);
        assertEquals(inOrderSuccessor(a7), a8);
        assertEquals(inOrderSuccessor(a8), a9);
        assertEquals(inOrderSuccessor(a9), a10);
        assertEquals(inOrderSuccessor(a10), a11);
        assertEquals(inOrderSuccessor(a11), a12);
        assertNull(inOrderSuccessor(a12));
    }

}