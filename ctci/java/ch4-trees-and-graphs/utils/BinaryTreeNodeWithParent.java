package utils;

/**
 * Created by jjlee on 8/19/16.
 */
public class BinaryTreeNodeWithParent<T> extends BinaryTreeNode<T> {
    public BinaryTreeNodeWithParent<T> left;
    public BinaryTreeNodeWithParent<T> right;
    public BinaryTreeNodeWithParent<T> parent;

    public BinaryTreeNodeWithParent(T data) {
        super(data);
    }

    public void setLeft(BinaryTreeNodeWithParent<T> other) {
        left = other;
        other.parent = this;
    }

    public void setRight(BinaryTreeNodeWithParent<T> other) {
        right = other;
        other.parent = this;
    }
}
