package q10_check_subtree;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/20/16.
 */
public class QuestionA {

    public static <T> boolean containsTree(BinaryTreeNode<T> t1, BinaryTreeNode<T> t2) {
        return containsTreeHelper(t1, t2, t2);
    }

    private static <T> boolean containsTreeHelper(BinaryTreeNode<T> t1, BinaryTreeNode<T> t2Root, BinaryTreeNode<T> t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

    }
}
