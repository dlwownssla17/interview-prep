package q11_random_node;

import java.util.Random;

/**
 * Created by jjlee on 8/21/16.
 */
public class BSTWithGetRandomNode<T extends Comparable<? super T>> {
    private BSTNodeWithGetRandomNode<T> root;

    BSTWithGetRandomNode() {
        root = null;
    }

    public void insert(T data) {
        if (root == null) root = new BSTNodeWithGetRandomNode<>(data);
        else insertFromNode(data, root);
    }

    private void insertFromNode(T data, BSTNodeWithGetRandomNode<T> n) {
        n.size++;
        if (n.data.compareTo(data) > -1) {
            if (n.left == null) n.left = new BSTNodeWithGetRandomNode<>(data);
            else insertFromNode(data, n.left);
        } else {
            if (n.right == null) n.right = new BSTNodeWithGetRandomNode<>(data);
            else insertFromNode(data, n.right);
        }
    }

    public BSTNodeWithGetRandomNode<T> find(T data) {
        if (root == null) return null;
        return findFromNode(data, root);
    }

    private BSTNodeWithGetRandomNode<T> findFromNode(T data, BSTNodeWithGetRandomNode<T> n) {
        if (n.data.equals(data)) return n;
        if (n.data.compareTo(data) > -1) return n.left == null ? null : findFromNode(data, n.left);
        return n.right == null ? null : findFromNode(data, n.right);
    }

    public boolean delete(T data) {
        return deleteFromNode(data, root, null);
    }

    private boolean deleteFromNode(T data, BSTNodeWithGetRandomNode<T> n, BSTNodeWithGetRandomNode<T> parent) {
        if (n == null) return false;

        boolean deleted;
        int cmp = n.data.compareTo(data);
        if (cmp == 0) {
            if (n.left == null || n.right == null) {
                BSTNodeWithGetRandomNode<T> child = n.left == null ? n.right : n.left;
                if (n == root) root = child;
                else if (n == parent.left) parent.left = child;
                else parent.right = child;
            } else {
                BSTNodeWithGetRandomNode<T> nodeToSwap = n.left;
                BSTNodeWithGetRandomNode<T> nodeToSwapParent = n;
                nodeToSwapParent.size--;
                while (nodeToSwap.right != null) {
                    nodeToSwapParent = nodeToSwap;
                    nodeToSwap = nodeToSwap.right;
                    nodeToSwapParent.size--;
                }
                T temp = n.data;
                n.data = nodeToSwap.data;
                nodeToSwap.data = temp;
                deleteFromNode(temp, nodeToSwap, nodeToSwapParent);
            }
            return true;
        } else if (cmp == 1) {
            deleted = deleteFromNode(data, n.left, n);
        } else {
            deleted = deleteFromNode(data, n.right, n);
        }

        if (deleted) n.size--;
        return deleted;
    }

    public BSTNodeWithGetRandomNode<T> getRandomNode() {
        if (root == null) return null;
        int r = new Random().nextInt(root.size);
        return getRandomNodeFromNode(r, root);
    }

    private BSTNodeWithGetRandomNode<T> getRandomNodeFromNode(int r, BSTNodeWithGetRandomNode<T> n) {
        int leftSize = n.left == null ? 0 : n.left.size;
        if (r == leftSize) return n;
        else if (r < leftSize) return getRandomNodeFromNode(r, n.left);
        else return getRandomNodeFromNode(r - leftSize - 1, n.right);
    }

    public int size() {
        return root == null ? 0 : root.size;
    }

    public String inOrderTraversal() {
        StringBuilder s = new StringBuilder();
        inOrderTraversalBuild(s, root);
        return s.toString();
    }

    private void inOrderTraversalBuild(StringBuilder s, BSTNodeWithGetRandomNode<T> n) {
        if (n == null) return;
        inOrderTraversalBuild(s, n.left);
        s.append(n.data.toString());
        inOrderTraversalBuild(s, n.right);
    }
}
