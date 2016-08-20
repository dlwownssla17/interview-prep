package q8_first_common_ancestor;

import utils.BinaryTreeNodeWithParent;

import java.util.HashSet;

/**
 * Created by jjlee on 8/20/16.
 */
public class QuestionB {

    public static <T> BinaryTreeNodeWithParent<T> firstCommonAncestorFromRoot(BinaryTreeNodeWithParent<T> root,
                                                                              BinaryTreeNodeWithParent<T> p,
                                                                              BinaryTreeNodeWithParent<T> q) {
        if (root == null || p == null || q == null) return null;
        HashSet<BinaryTreeNodeWithParent<T>> descendants = new HashSet<>();
        descendants.add(p);
        descendants.add(q);
        if (!areDescendants(root, descendants)) return null;
        return firstCommonAncestorFromRootHelper(root, p, q);
    }

    private static <T> boolean areDescendants(BinaryTreeNodeWithParent<T> root,
                                              HashSet<BinaryTreeNodeWithParent<T>> descendants) {
        if (descendants.isEmpty()) return true;
        if (root == null) return false;
        if (descendants.contains(root)) descendants.remove(root);
        return areDescendants(root.left, descendants) || areDescendants(root.right, descendants);
    }

    private static <T> BinaryTreeNodeWithParent<T> firstCommonAncestorFromRootHelper(BinaryTreeNodeWithParent<T> root,
                                                                                    BinaryTreeNodeWithParent<T> p,
                                                                                    BinaryTreeNodeWithParent<T> q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        BinaryTreeNodeWithParent<T> fromLeft = firstCommonAncestorFromRootHelper(root.left, p, q);
        BinaryTreeNodeWithParent<T> fromRight = firstCommonAncestorFromRootHelper(root.right, p, q);
        return fromLeft == null ? fromRight : (fromRight == null ? fromLeft : root);
    }
}
