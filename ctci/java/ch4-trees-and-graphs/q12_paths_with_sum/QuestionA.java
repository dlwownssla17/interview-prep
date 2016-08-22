package q12_paths_with_sum;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/21/16.
 */
public class QuestionA {
    /* naive way to count paths with sum by starting path from every node from root (O(N^2) time, O(logN) space) */
    public static int countPathsWithSum(BinaryTreeNode<Integer> root, int sum) {
        return countPathsWithSumFromNode(root, sum) +
                (root == null ? 0 : countPathsWithSum(root.left, sum) + countPathsWithSum(root.right, sum));
    }

    private static int countPathsWithSumFromNode(BinaryTreeNode<Integer> n, int sum) {
        if (n == null) return 0;
        int diff = sum - n.data;
        return (diff == 0 ? 1 : 0) + countPathsWithSumFromNode(n.left, diff) + countPathsWithSumFromNode(n.right, diff);
    }
}
