package q4_check_balanced;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNode;

import static org.testng.Assert.*;
import static q4_check_balanced.Question.*;

/**
 * Created by jjlee on 8/19/16.
 */
public class Tester {
    BinaryTreeNode<Integer> a0, b0, b1, c0, c1, c2, d0, d1, d2, e0, e1, e2, e3, e4, e5, e6, e7,
            f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, g0, g1, g2, g3, g4, g5;

    @BeforeMethod
    public void setup() throws Exception {
        a0 = new BinaryTreeNode<>(0);
        b0 = new BinaryTreeNode<>(0);
        b1 = new BinaryTreeNode<>(1);
        b0.left = b1;
        c0 = new BinaryTreeNode<>(0);
        c1 = new BinaryTreeNode<>(1);
        c2 = new BinaryTreeNode<>(2);
        c0.left = c1;
        c0.right = c2;
        d0 = new BinaryTreeNode<>(0);
        d1 = new BinaryTreeNode<>(1);
        d2 = new BinaryTreeNode<>(2);
        d0.left = d1;
        d1.left = d2;
        e0 = new BinaryTreeNode<>(0);
        e1 = new BinaryTreeNode<>(1);
        e2 = new BinaryTreeNode<>(2);
        e3 = new BinaryTreeNode<>(3);
        e4 = new BinaryTreeNode<>(4);
        e5 = new BinaryTreeNode<>(5);
        e6 = new BinaryTreeNode<>(6);
        e7 = new BinaryTreeNode<>(7);
        e0.left = e1;
        e0.right = e2;
        e1.left = e3;
        e1.right = e4;
        e2.right = e5;
        e4.left = e6;
        e4.right = e7;
        f0 = new BinaryTreeNode<>(0);
        f1 = new BinaryTreeNode<>(1);
        f2 = new BinaryTreeNode<>(2);
        f3 = new BinaryTreeNode<>(3);
        f4 = new BinaryTreeNode<>(4);
        f5 = new BinaryTreeNode<>(5);
        f6 = new BinaryTreeNode<>(6);
        f7 = new BinaryTreeNode<>(7);
        f8 = new BinaryTreeNode<>(8);
        f9 = new BinaryTreeNode<>(9);
        f10 = new BinaryTreeNode<>(10);
        f11 = new BinaryTreeNode<>(11);
        f12 = new BinaryTreeNode<>(12);
        f13 = new BinaryTreeNode<>(13);
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
        g0 = new BinaryTreeNode<>(0);
        g1 = new BinaryTreeNode<>(1);
        g2 = new BinaryTreeNode<>(2);
        g3 = new BinaryTreeNode<>(3);
        g4 = new BinaryTreeNode<>(4);
        g5 = new BinaryTreeNode<>(5);
        g0.left = g1;
        g0.right = g2;
        g1.left = g3;
        g2.left = g4;
        g3.right = g5;
    }

    @Test
    public void testIsBalanced() throws Exception {
        assertTrue(isBalanced(null));
        assertTrue(isBalanced(a0));
        assertTrue(isBalanced(b0));
        assertTrue(isBalanced(c0));
        assertFalse(isBalanced(d0));
        assertTrue(isBalanced(e0));
        assertTrue(isBalanced(f0));
        assertFalse(isBalanced(g0));
    }

}