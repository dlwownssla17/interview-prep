package q8_first_common_ancestor;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNodeWithParent;

import java.util.ArrayList;

import static org.testng.Assert.*;
import static q8_first_common_ancestor.QuestionA.*;
import static q8_first_common_ancestor.QuestionB.*;

/**
 * Created by jjlee on 8/20/16.
 */
public class Tester {
    ArrayList<BinaryTreeNodeWithParent<Integer>> tree;

    @BeforeMethod
    public void setup() throws Exception {
        tree = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            tree.add(new BinaryTreeNodeWithParent<>(i));
        }
        for (int i = 0; i < 15; i++) {
            BinaryTreeNodeWithParent<Integer> parent = tree.get(i);
            BinaryTreeNodeWithParent<Integer> leftChild = tree.get(2 * i + 1);
            BinaryTreeNodeWithParent<Integer> rightChild = tree.get(2 * i + 2);
            parent.setLeft(leftChild);
            parent.setRight(rightChild);
        }
    }

    @Test
    public void testFirstCommonAncestor() throws Exception {
        assertNull(firstCommonAncestor(tree.get(0), null));
        assertNull(firstCommonAncestor(tree.get(0), tree.get(31)));
        assertEquals(firstCommonAncestor(tree.get(0), tree.get(0)), tree.get(0));
        assertEquals(firstCommonAncestor(tree.get(7), tree.get(7)), tree.get(7));
        assertEquals(firstCommonAncestor(tree.get(1), tree.get(18)), tree.get(1));
        assertEquals(firstCommonAncestor(tree.get(18), tree.get(1)), tree.get(1));
        assertEquals(firstCommonAncestor(tree.get(1), tree.get(2)), tree.get(0));
        assertEquals(firstCommonAncestor(tree.get(4), tree.get(7)), tree.get(1));
        assertEquals(firstCommonAncestor(tree.get(23), tree.get(27)), tree.get(2));
        assertEquals(firstCommonAncestor(tree.get(10), tree.get(23)), tree.get(0));
        assertEquals(firstCommonAncestor(tree.get(15), tree.get(30)), tree.get(0));
    }

    @Test
    public void testFirstCommonAncestorFromRoot() throws Exception {
        BinaryTreeNodeWithParent<Integer> root = tree.get(0);
        assertNull(firstCommonAncestorFromRoot(root, tree.get(0), null));
        assertNull(firstCommonAncestorFromRoot(root, tree.get(0), tree.get(31)));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(0), tree.get(0)), tree.get(0));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(7), tree.get(7)), tree.get(7));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(1), tree.get(18)), tree.get(1));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(18), tree.get(1)), tree.get(1));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(1), tree.get(2)), tree.get(0));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(4), tree.get(7)), tree.get(1));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(23), tree.get(27)), tree.get(2));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(10), tree.get(23)), tree.get(0));
        assertEquals(firstCommonAncestorFromRoot(root, tree.get(15), tree.get(30)), tree.get(0));
    }
}
