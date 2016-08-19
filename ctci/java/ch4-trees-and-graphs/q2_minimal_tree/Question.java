package q2_minimal_tree;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/17/16.
 */
public class Question {
    /* create a binary search tree with minimal height given a sorted (increasing order) array */
    public static <T extends Comparable<? super T>> BinaryTreeNode<T> toMinimalBST(T[] arr) {
        return toMinimalBSTByIndex(arr, 0, arr.length - 1);
    }

    /* recursive helper function using indices of first and last elements */
    private static <T extends Comparable<? super T>> BinaryTreeNode<T> toMinimalBSTByIndex(T[] arr, int first, int last) {
        if (first > last) return null;
        int mid = (first + last) / 2;
        BinaryTreeNode<T> n = new BinaryTreeNode<T>(arr[mid]);
        n.left = toMinimalBSTByIndex(arr, first, mid - 1);
        n.right = toMinimalBSTByIndex(arr, mid + 1, last);
        return n;
    }
}
