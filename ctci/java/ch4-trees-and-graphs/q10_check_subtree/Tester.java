package q10_check_subtree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNode;

import java.util.ArrayList;

import static org.testng.Assert.*;
import static q10_check_subtree.QuestionA.*;
import static q10_check_subtree.QuestionB.*;

/**
 * Created by jjlee on 8/20/16.
 */
public class Tester {
    ArrayList<BinaryTreeNode<Integer>> bigTree, smallTree0, smallTree1, smallTree2, smallTree3, smallTree4, smallTree5;
    BinaryTreeNode<Integer> a0, a1, a2, a3, b0, b1, c0, c1, c2, d0, d1, d2, d3;

    @BeforeMethod
    public void setup() throws Exception {
        bigTree = createPowerOfTwoPyramidTree(1, 256);
        smallTree0 = createPowerOfTwoPyramidTree(1, 128);
        smallTree1 = createPowerOfTwoPyramidTree(2, 128);
        smallTree2 = createPowerOfTwoPyramidTree(64, 4);
        smallTree3 = createPowerOfTwoPyramidTree(1, 256);
        smallTree4 = createPowerOfTwoPyramidTree(128, 2);
        smallTree5 = new ArrayList<>();
        int pow = 1;
        for (int i = 0; i < 7; i++) {
            smallTree5.add(new BinaryTreeNode<>(pow));
            pow *= 2;
        }
        for (int i = 0; i < 6; i++) {
            BinaryTreeNode<Integer> parent = smallTree5.get(i);
            BinaryTreeNode<Integer> rightChild = smallTree5.get(i + 1);
            parent.right = rightChild;
        }

        a0 = new BinaryTreeNode<>(0);
        a1 = new BinaryTreeNode<>(1);
        a2 = new BinaryTreeNode<>(0);
        a3 = new BinaryTreeNode<>(1);
        a0.left = a1;
        a0.right = a2;
        a2.right = a3;
        b0 = new BinaryTreeNode<>(0);
        b1 = new BinaryTreeNode<>(1);
        b0.right = b1;
        c0 = new BinaryTreeNode<>(0);
        c1 = new BinaryTreeNode<>(0);
        c2 = new BinaryTreeNode<>(1);
        c0.right = c1;
        c1.left = c2;
        d0 = new BinaryTreeNode<>(0);
        d1 = new BinaryTreeNode<>(1);
        d2 = new BinaryTreeNode<>(0);
        d3 = new BinaryTreeNode<>(1);
        d0.left = d1;
        d0.right = d2;
        d2.left = d3;
    }

    private ArrayList<BinaryTreeNode<Integer>> createPowerOfTwoPyramidTree(int initPow, int powerOfTwoSize) {
        ArrayList<BinaryTreeNode<Integer>> tree = new ArrayList<>();
        int pow = initPow;
        for (int i = 0; i < powerOfTwoSize - 1; i++) {
            if (i * initPow == pow) pow *= 2;
            tree.add(new BinaryTreeNode<>(pow));
        }
        for (int i = 0; i < (powerOfTwoSize / 2) - 1; i++) {
            BinaryTreeNode<Integer> parent = tree.get(i);
            BinaryTreeNode<Integer> leftChild = tree.get(2 * i + 1);
            BinaryTreeNode<Integer> rightChild = tree.get(2 * i + 2);
            parent.left = leftChild;
            parent.right = rightChild;
        }
        return tree;
    }

    @Test
    public void testContainsTree() throws Exception {
        BinaryTreeNode<Integer> root = bigTree.get(0);
        assertTrue(containsTree(null, null));
        assertTrue(containsTree(root, null));
        assertFalse(containsTree(null, root));
        assertFalse(containsTree(root, smallTree0.get(0)));
        assertTrue(containsTree(root, smallTree1.get(0)));
        assertTrue(containsTree(root, smallTree2.get(0)));
        assertTrue(containsTree(root, smallTree3.get(0)));
        assertTrue(containsTree(root, smallTree4.get(0)));
        assertFalse(containsTree(root, smallTree5.get(0)));

        assertTrue(containsTree(a0, b0));
        assertFalse(containsTree(a0, c0));
        assertFalse(containsTree(a0, d0));
    }

    @Test
    public void testContainsTreePreOrder() throws Exception {
        BinaryTreeNode<Integer> root = bigTree.get(0);
        assertTrue(containsTreePreOrder(null, null));
        assertTrue(containsTreePreOrder(root, null));
        assertFalse(containsTreePreOrder(null, root));
        assertFalse(containsTreePreOrder(root, smallTree0.get(0)));
        assertTrue(containsTreePreOrder(root, smallTree1.get(0)));
        assertTrue(containsTreePreOrder(root, smallTree2.get(0)));
        assertTrue(containsTreePreOrder(root, smallTree3.get(0)));
        assertTrue(containsTreePreOrder(root, smallTree4.get(0)));
        assertFalse(containsTreePreOrder(root, smallTree5.get(0)));

        assertTrue(containsTreePreOrder(a0, b0));
        assertFalse(containsTreePreOrder(a0, c0));
        assertFalse(containsTreePreOrder(a0, d0));
    }
}