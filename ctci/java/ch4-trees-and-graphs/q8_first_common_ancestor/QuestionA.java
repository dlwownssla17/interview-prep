package q8_first_common_ancestor;

import utils.BinaryTreeNode;
import utils.BinaryTreeNodeWithParent;

/**
 * Created by jjlee on 8/20/16.
 */
public class QuestionA {

    public static <T> BinaryTreeNodeWithParent<T> firstCommonAncestor(BinaryTreeNodeWithParent<T> p,
                                                                      BinaryTreeNodeWithParent<T> q) {
        if (p == null || q == null) return null;
        if (isDescendant(p, q)) return p;
        if (isDescendant(q, p)) return q;
        return climbUpUntilFirstCommonAncestor(p, q);
    }

    private static <T> boolean isDescendant(BinaryTreeNodeWithParent<T> root, BinaryTreeNodeWithParent<T> n) {
        if (root == null || n == null) return false;
        if (root == n) return true;
        return isDescendant(root.left, n) || isDescendant(root.right, n);
    }

    private static <T> BinaryTreeNodeWithParent<T> sibling(BinaryTreeNodeWithParent<T> n) {
        if (n == null || n.parent == null) return null;
        return n == n.parent.left ? n.parent.right : n.parent.left;
    }

    private static <T> BinaryTreeNodeWithParent<T> climbUpUntilFirstCommonAncestor(BinaryTreeNodeWithParent<T> p,
                                                                                   BinaryTreeNodeWithParent<T> q) {
        BinaryTreeNodeWithParent<T> current = p;
        while (current.parent != null) {
            if (isDescendant(sibling(current), q)) return current.parent;
            current = current.parent;
        }
        return null;
    }
}
