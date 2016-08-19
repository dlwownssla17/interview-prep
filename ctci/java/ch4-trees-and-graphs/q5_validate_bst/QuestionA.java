package q5_validate_bst;

import utils.BinaryTreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 8/19/16.
 */
public class QuestionA {
    /* store data from all nodes in order into list, then iterate through list
       (inefficient, assumes left <= root <= right) */
    public static <T extends Comparable<? super T>> boolean checkBSTInOrderTraversal(BinaryTreeNode<T> n) {
        List<T> inOrder = new LinkedList<>();
        populateInOrder(n, inOrder);
        T previousData = null;
        for (T data : inOrder) {
            if (previousData != null && data.compareTo(previousData) == -1) return false;
            previousData = data;
        }
        return true;
    }

    private static <T extends Comparable<? super T>> void populateInOrder(BinaryTreeNode<T> n, List<T> inOrder) {
        if (n == null) return;
        populateInOrder(n.left, inOrder);
        inOrder.add(n.data);
        populateInOrder(n.right, inOrder);
    }
}
