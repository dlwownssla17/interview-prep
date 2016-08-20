package utils;

/**
 * Created by jjlee on 8/17/16.
 */
public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || !(o instanceof BinaryTreeNode)) return false;
//
//        BinaryTreeNode n = (BinaryTreeNode) o;
//
//        if (!data.equals(n.data)) return false;
//
//        if (left == null) {
//            if (n.left != null) return false;
//        } else if (!left.equals(n.left)) {
//            return false;
//        }
//
//        if (right == null) {
//            if (n.right != null) return false;
//        } else if (!right.equals(n.right)) {
//            return false;
//        }
//
//        return true;
//    }
}
