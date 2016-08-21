package q10_check_subtree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNode;
import utils.BinaryTreeNodeWithParent;

import java.util.ArrayList;

import static org.testng.Assert.*;
import static q10_check_subtree.QuestionA.*;
import static q10_check_subtree.QuestionB.*;

/**
 * Created by jjlee on 8/20/16.
 */
public class Tester {
    ArrayList<BinaryTreeNode<Integer>> bigTree, smallTree0, smallTree1, smallTree2, smallTree3, smallTree4, smallTree5;

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
    }

    @Test
    public void testContainsTreeOneVisitMultipleChecks() throws Exception {
        BinaryTreeNode<Integer> root = bigTree.get(0);
        assertTrue(containsTreeOneVisitMultipleChecks(null, null));
        assertTrue(containsTreeOneVisitMultipleChecks(root, null));
        assertFalse(containsTreeOneVisitMultipleChecks(null, root));
        assertFalse(containsTreeOneVisitMultipleChecks(root, smallTree0.get(0)));
        assertTrue(containsTreeOneVisitMultipleChecks(root, smallTree1.get(0)));
        assertTrue(containsTreeOneVisitMultipleChecks(root, smallTree2.get(0)));
        assertTrue(containsTreeOneVisitMultipleChecks(root, smallTree3.get(0)));
        assertTrue(containsTreeOneVisitMultipleChecks(root, smallTree4.get(0)));
        assertFalse(containsTreeOneVisitMultipleChecks(root, smallTree5.get(0)));

    }
}