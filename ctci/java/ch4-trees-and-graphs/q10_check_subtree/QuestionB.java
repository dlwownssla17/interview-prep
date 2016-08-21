package q10_check_subtree;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/20/16.
 */
public class QuestionB {
    private static Character NULL_CHARACTER = '.';

    /* check if t2 is a subtree of t1 by comparing in-order and pre-order traversals, data should not be NULL_CHARACTER
       (O(M + N) time, O(M + N) space) */
    public static <T> boolean containsTreeInOrderPreOrder(BinaryTreeNode<T> t1, BinaryTreeNode<T> t2) {
        return inOrderString(t1).contains(inOrderString(t2)) && preOrderString(t1).contains(preOrderString(t2));
    }

    private static <T> String inOrderString(BinaryTreeNode<T> t) {
        StringBuilder s = new StringBuilder();
        inOrderStringBuild(t, s);
        return s.toString();
    }

    private static <T> void inOrderStringBuild(BinaryTreeNode<T> t, StringBuilder s) {
        if (t == null) {
            s.append(NULL_CHARACTER);
            return;
        }
        inOrderStringBuild(t.left, s);
        s.append(t.data.toString());
        inOrderStringBuild(t.right, s);
    }

    private static <T> String preOrderString(BinaryTreeNode<T> t) {
        StringBuilder s = new StringBuilder();
        preOrderStringBuild(t, s);
        return s.toString();
    }

    private static <T> void preOrderStringBuild(BinaryTreeNode<T> t, StringBuilder s) {
        if (t == null) {
            s.append(NULL_CHARACTER);
            return;
        }
        s.append(t.data.toString());
        preOrderStringBuild(t.left, s);
        preOrderStringBuild(t.right, s);
    }
}
