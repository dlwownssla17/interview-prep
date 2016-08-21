package q9_bst_sequences;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.testng.Assert.*;
import static q9_bst_sequences.Question.*;

/**
 * Created by jjlee on 8/20/16.
 */
public class Tester {
    ArrayList<BinaryTreeNode<Integer>> tree;

    @BeforeMethod
    public void setup() throws Exception {
        tree = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tree.add(new BinaryTreeNode<>(i));
        }
        tree.get(6).left = tree.get(1);
        tree.get(6).right = tree.get(7);
        tree.get(1).left = tree.get(0);
        tree.get(1).right = tree.get(3);
        tree.get(7).right = tree.get(9);
        tree.get(3).left = tree.get(2);
        tree.get(3).right = tree.get(4);
        tree.get(9).left = tree.get(8);
        tree.get(4).right = tree.get(5);
        tree.get(9).left = tree.get(8);
    }

    private <T extends Comparable<? super T>> BinaryTreeNode<T> createBST(LinkedList<T> sequence) {
        BinaryTreeNode<T> root = null;
        for (T data : sequence) {
            if (root == null) root = new BinaryTreeNode<>(data);
            else add(root, data);
        }
        return root;
    }

    private <T extends Comparable<? super T>> void add(BinaryTreeNode<T> root, T data) {
        if (root.data.compareTo(data) > 0) {
            if (root.left == null) root.left = new BinaryTreeNode<>(data);
            else add(root.left, data);
        } else {
            if (root.right == null) root.right = new BinaryTreeNode<>(data);
            else add(root.right, data);
        }
    }

    private <T> boolean sameData(BinaryTreeNode<T> n1, BinaryTreeNode<T> n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        return n1.data.equals(n2.data) && sameData(n1.left, n2.left) && sameData(n1.right, n2.right);
    }

    @Test
    public void testAllBSTSequences() throws Exception {
        assertTrue(allBSTSequences(null).isEmpty());

        ArrayList<LinkedList<Integer>> sequences = allBSTSequences(tree.get(6));
        for (LinkedList<Integer> seq : sequences) {
            assertTrue(sameData(tree.get(6), createBST(seq)));
        }
    }
}