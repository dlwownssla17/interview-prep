package q10_check_subtree;

import utils.BinaryTreeNode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by jjlee on 8/20/16.
 */
public class QuestionB {
    /* check if t2 is a subtree of t1 by keeping track of all candidates for matching root node */
    public static <T> boolean containsTreeOneVisitMultipleChecks(BinaryTreeNode<T> t1, BinaryTreeNode<T> t2) {
        if (t2 == null) return true;
        return oneVisitMultipleChecks(t1, t2, new HashSet<>());
    }

    private static <T> boolean oneVisitMultipleChecks(BinaryTreeNode<T> t1, BinaryTreeNode<T> t2Root,
                                                      HashSet<BinaryTreeNode<T>> checks) {
        if (t1 == null && checks.contains(null)) return true;
        if (t1 == null || checks.contains(null)) {
            checks.remove(null);
            return false;
        }

        Iterator<BinaryTreeNode<T>> itr = checks.iterator();
        while (itr.hasNext()) {
            BinaryTreeNode<T> n = itr.next();
            if (!t1.data.equals(n.data)) checks.remove(n);
        }

        if (t1.data.equals(t2Root.data)) checks.add(t2Root);

        HashSet<BinaryTreeNode<T>> checksForRight = new HashSet<>();
        for (BinaryTreeNode<T> n : checks) {
            checksForRight.add(n.right);
            n = n.left;
        }

        return oneVisitMultipleChecks(t1.left, t2Root, checks) || oneVisitMultipleChecks(t1.right, t2Root, checksForRight);
    }
}
