package q5_validate_bst;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNode;

import static org.testng.Assert.*;
import static q5_validate_bst.QuestionA.*;
import static q5_validate_bst.QuestionB.*;
import static q5_validate_bst.QuestionC.*;


/**
 * Created by jjlee on 8/19/16.
 */
public class Tester {
    BinaryTreeNode<Integer> a0, b0, b1, c0, c1, c2, d0, d1, d2, e0, e1, e2, e3, e4, e5, e6, e7,
            f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14,
            g0, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13, g14;

    @BeforeMethod
    public void setup() throws Exception {
        a0 = new BinaryTreeNode<>(0);
        b0 = new BinaryTreeNode<>(1);
        b1 = new BinaryTreeNode<>(0);
        b0.left = b1;
        c0 = new BinaryTreeNode<>(0);
        c1 = new BinaryTreeNode<>(0);
        c2 = new BinaryTreeNode<>(1);
        c0.left = c1;
        c0.right = c2;
        d0 = new BinaryTreeNode<>(0);
        d1 = new BinaryTreeNode<>(1);
        d2 = new BinaryTreeNode<>(1);
        d0.right = d1;
        d1.right = d2;
        e0 = new BinaryTreeNode<>(5);
        e1 = new BinaryTreeNode<>(1);
        e2 = new BinaryTreeNode<>(6);
        e3 = new BinaryTreeNode<>(0);
        e4 = new BinaryTreeNode<>(3);
        e5 = new BinaryTreeNode<>(7);
        e6 = new BinaryTreeNode<>(2);
        e7 = new BinaryTreeNode<>(4);
        e0.left = e1;
        e0.right = e2;
        e1.left = e3;
        e1.right = e4;
        e2.right = e5;
        e4.left = e6;
        e4.right = e7;
        f0 = new BinaryTreeNode<>(7);
        f1 = new BinaryTreeNode<>(3);
        f2 = new BinaryTreeNode<>(11);
        f3 = new BinaryTreeNode<>(1);
        f4 = new BinaryTreeNode<>(5);
        f5 = new BinaryTreeNode<>(9);
        f6 = new BinaryTreeNode<>(13);
        f7 = new BinaryTreeNode<>(0);
        f8 = new BinaryTreeNode<>(2);
        f9 = new BinaryTreeNode<>(4);
        f10 = new BinaryTreeNode<>(6);
        f11 = new BinaryTreeNode<>(8);
        f12 = new BinaryTreeNode<>(10);
        f13 = new BinaryTreeNode<>(12);
        f14 = new BinaryTreeNode<>(14);
        f0.left = f1;
        f0.right = f2;
        f1.left = f3;
        f1.right = f4;
        f2.left = f5;
        f2.right = f6;
        f3.left = f7;
        f3.right = f8;
        f4.left = f9;
        f4.right = f10;
        f5.left = f11;
        f5.right = f12;
        f6.left = f13;
        f6.right = f14;
        g0 = new BinaryTreeNode<>(8);
        g1 = new BinaryTreeNode<>(3);
        g2 = new BinaryTreeNode<>(11);
        g3 = new BinaryTreeNode<>(1);
        g4 = new BinaryTreeNode<>(5);
        g5 = new BinaryTreeNode<>(9);
        g6 = new BinaryTreeNode<>(13);
        g7 = new BinaryTreeNode<>(0);
        g8 = new BinaryTreeNode<>(2);
        g9 = new BinaryTreeNode<>(4);
        g10 = new BinaryTreeNode<>(6);
        g11 = new BinaryTreeNode<>(7);
        g12 = new BinaryTreeNode<>(10);
        g13 = new BinaryTreeNode<>(12);
        g14 = new BinaryTreeNode<>(14);
        g0.left = g1;
        g0.right = g2;
        g1.left = g3;
        g1.right = g4;
        g2.left = g5;
        g2.right = g6;
        g3.left = g7;
        g3.right = g8;
        g4.left = g9;
        g4.right = g10;
        g5.left = g11;
        g5.right = g12;
        g6.left = g13;
        g6.right = g14;
    }

    @Test
    public void testCheckBSTInOrderTraversal() throws Exception {
        assertTrue(checkBSTInOrderTraversal(null));
        assertTrue(checkBSTInOrderTraversal(a0));
        assertTrue(checkBSTInOrderTraversal(b0));
        assertTrue(checkBSTInOrderTraversal(c0));
        assertFalse(checkBSTInOrderTraversal(d0));
        assertTrue(checkBSTInOrderTraversal(e0));
        assertTrue(checkBSTInOrderTraversal(f0));
        assertFalse(checkBSTInOrderTraversal(g0));
    }

    @Test
    public void testCheckBSTResultWithMinAndMax() throws Exception {
        assertTrue(checkBSTResultWithMinAndMax(null));
        assertTrue(checkBSTResultWithMinAndMax(a0));
        assertTrue(checkBSTResultWithMinAndMax(b0));
        assertTrue(checkBSTResultWithMinAndMax(c0));
        assertFalse(checkBSTResultWithMinAndMax(d0));
        assertTrue(checkBSTResultWithMinAndMax(e0));
        assertTrue(checkBSTResultWithMinAndMax(f0));
        assertFalse(checkBSTResultWithMinAndMax(g0));
    }

    @Test
    public void testCheckBSTAcceptableRange() throws Exception {
        assertTrue(checkBSTAcceptableRange(null));
        assertTrue(checkBSTAcceptableRange(a0));
        assertTrue(checkBSTAcceptableRange(b0));
        assertTrue(checkBSTAcceptableRange(c0));
        assertFalse(checkBSTAcceptableRange(d0));
        assertTrue(checkBSTAcceptableRange(e0));
        assertTrue(checkBSTAcceptableRange(f0));
        assertFalse(checkBSTAcceptableRange(g0));
    }

}