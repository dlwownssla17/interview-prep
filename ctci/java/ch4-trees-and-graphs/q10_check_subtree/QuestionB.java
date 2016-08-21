package q10_check_subtree;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/20/16.
 */
public class QuestionB {
    private static Character NULL_CHARACTER = '.';

    /* check if t2 is a subtree of t1 by comparing pre-order traversal strings, data should not be NULL_CHARACTER
       (O(M + N) time, O(M + N) space) */
    public static <T> boolean containsTreePreOrder(BinaryTreeNode<T> t1, BinaryTreeNode<T> t2) {
        return preOrderString(t1).contains(preOrderString(t2));
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
