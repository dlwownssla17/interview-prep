package q10_check_subtree;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/20/16.
 */
public class QuestionA {
    /* check if t2 is a subtree of t1 from every node that matches its root recursively (O(MN) time, O(logM) space) */
    public static <T> boolean containsTree(BinaryTreeNode<T> t1, BinaryTreeNode<T> t2) {
        if (t2 == null) return true;
        return containsTreeHelper(t1, t2);
    }

    private static <T> boolean containsTreeHelper(BinaryTreeNode<T> t1, BinaryTreeNode<T> t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        boolean sameFromHere = t1.data.equals(t2.data) && containsTreeHelper(t1.left, t2.left) && containsTreeHelper(t1.right, t2.right);
        if (sameFromHere) return true;
        if (containsTreeHelper(t1.left, t2)) return true;
        return containsTreeHelper(t1.right, t2);
    }
}
