package q11_random_node;

import utils.BinaryTreeNode;

/**
 * Created by jjlee on 8/21/16.
 */
public class BSTNodeWithGetRandomNode<T extends Comparable<? super T>> extends BinaryTreeNode<T> {
    public int size;
    public BSTNodeWithGetRandomNode<T> left;
    public BSTNodeWithGetRandomNode<T> right;

    public BSTNodeWithGetRandomNode(T data) {
        super(data);
        size = 1;
    }
}
