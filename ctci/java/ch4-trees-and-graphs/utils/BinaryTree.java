package utils;

/**
 * Created by jjlee on 8/17/16.
 */
public class BinaryTree {

    public static <T extends Comparable<? super T>> boolean isBST(BinaryTreeNode<T> n) {
        if (n == null) return true;
        return (n.left == null || n.left.data.compareTo(n.data) < 1) &&
                (n.right == null || n.right.data.compareTo(n.data) > -1) && isBST(n.left) && isBST(n.right);
    }

    public static <T> int getSize(BinaryTreeNode<T> n) {
        if (n == null) return 0;
        return 1 + getSize(n.left) + getSize(n.right);
    }

    public static <T> int getHeight(BinaryTreeNode<T> n) {
        if (n == null) return 0;
        return 1 + Math.max(getHeight(n.left), getHeight(n.right));
    }

    public static <T> boolean sameData(BinaryTreeNode<T> n1, BinaryTreeNode<T> n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        return n1.data.equals(n2.data) && sameData(n1.left, n2.left) && sameData(n1.right, n2.right);
    }
}
