package q5_validate_bst;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/19/16.
 */
public class QuestionA {
    /* use Wrapper class to pass along while comparing in order (assumes left <= root < right) */
    public static <T extends Comparable<? super T>> boolean checkBSTInOrderTraversal(BinaryTreeNode<T> n) {
        return compareInOrder(n, new Wrapper<>(), false);
    }

    private static <T extends Comparable<? super T>> boolean compareInOrder(BinaryTreeNode<T> n, Wrapper<T> previousData, boolean forRight) {
        if (n == null) return true;
        if (!compareInOrder(n.left, previousData, false)) return false;
        if (previousData.data != null && previousData.data.compareTo(n.data) >= (forRight ? 0 : 1)) return false;
        previousData.data = n.data;
        return compareInOrder(n.right, previousData, true);
    }

    private static class Wrapper<T extends Comparable<? super T>> {
        private T data;
    }
}
