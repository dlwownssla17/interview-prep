package q5_validate_bst;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/19/16.
 */
public class QuestionC {
    /* use acceptable range with min and max as arguments
       (implemented for Integer parameter, assumes left <= root < right) */
    public static boolean checkBSTAcceptableRange(BinaryTreeNode<Integer> n) {
        return checkBSTAcceptableRangeHelper(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBSTAcceptableRangeHelper(BinaryTreeNode<Integer> n, int min, int max) {
        if (n == null) return true;
        if (n.data < min || n.data > max) return false;
        return checkBSTAcceptableRangeHelper(n.left, min, n.data) && checkBSTAcceptableRangeHelper(n.right, n.data + 1, max);
    }
}
