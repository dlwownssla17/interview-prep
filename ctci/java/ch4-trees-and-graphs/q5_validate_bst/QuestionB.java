package q5_validate_bst;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/19/16.
 */
public class QuestionB {
    /* use Result class with isBST for subtree as well as that subtree's min and max */
    public static <T extends Comparable<? super T>> boolean checkBSTResultWithMinAndMax(BinaryTreeNode<T> n) {
        return checkBSTResultWithMinAndMaxHelper(n).isBST;
    }

    private static <T extends Comparable<? super T>> Result<T> checkBSTResultWithMinAndMaxHelper(BinaryTreeNode<T> n) {
        Result<T> result = new Result<>();

        if (n == null) {
            result.isBST = true;
            return result;
        }

        Result<T> fromLeft = checkBSTResultWithMinAndMaxHelper(n.left);
        if (!fromLeft.isBST || (fromLeft.max != null && fromLeft.max.compareTo(n.data) == 1)) return result;
        Result<T> fromRight = checkBSTResultWithMinAndMaxHelper(n.right);
        if (!fromRight.isBST || (fromRight.min != null && fromRight.min.compareTo(n.data) == -1)) return result;

        result.isBST = true;
        result.min = fromLeft.min != null ? fromLeft.min : n.data;
        result.max = fromRight.max != null ? fromRight.max : n.data;

        return result;
    }

    private static class Result<T extends Comparable<? super T>> {
        private boolean isBST;
        private T min;
        private T max;
    }
}
