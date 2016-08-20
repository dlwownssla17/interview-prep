package q6_successor;

import utils.BinaryTreeNodeWithParent;

/**
 * Created by jjlee on 8/19/16.
 */
public class Question {
    /* return either the left most child or the first right parent of the BST node as its in order successor
       (null if neither exists) */
    public static <T extends Comparable<? super T>> BinaryTreeNodeWithParent<T> inOrderSuccessor(BinaryTreeNodeWithParent<T> n) {
        if (n == null) return null;
        if (n.right != null) {
            BinaryTreeNodeWithParent<T> leftMostChild = n.right;
            while (leftMostChild.left != null) leftMostChild = leftMostChild.left;
            return leftMostChild;
        }
        BinaryTreeNodeWithParent<T> firstRightParent = n.parent;
        while (firstRightParent != null && firstRightParent.right == n) {
            n = n.parent;
            firstRightParent = firstRightParent.parent;
        }
        return firstRightParent;
    }
}
