package q4_check_balanced;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/19/16.
 */
public class Question {
    /* use integer return to evaluate both height and whether or not the tree is balanced (-1) */
    public static boolean isBalanced(BinaryTreeNode n) {
        return maxHeightBalanced(n) != -1;
    }

    private static int maxHeightBalanced(BinaryTreeNode n) {
        if (n == null) return 0;
        int maxHeightLeft = maxHeightBalanced(n.left);
        if (maxHeightLeft == -1) return -1;
        int maxHeightRight = maxHeightBalanced(n.right);
        if (maxHeightRight == -1) return -1;
        if (Math.abs(maxHeightLeft - maxHeightRight) > 1) return -1;
        return 1 + Math.max(maxHeightLeft, maxHeightRight);
    }
}
