package q6_palindrome;

import utils.Node;

/**
 * Created by jjlee on 7/31/16.
 */
public class QuestionC {
    /* recursive with get length */
    public static boolean isPalindromeRecursive(Node n) {
        int length = getLength(n);
        return isPalindromeRecursiveHelper(n, length).result;
    }

    /* helper returning palindrome result class */
    private static PalindromeResult isPalindromeRecursiveHelper(Node n, int remainingLength) {
        if (remainingLength <= 1) return remainingLength == 0 ? new PalindromeResult(true, n) : new PalindromeResult(true, n.next);

        PalindromeResult pr = isPalindromeRecursiveHelper(n.next, remainingLength - 2);
        if (pr.result) {
            if (!n.data.equals(pr.compareNode.data)) pr.result = false;
            else pr.compareNode = pr.compareNode.next;
        }
        return pr;
    }

    /* gets length of given list */
    private static int getLength(Node n) {
        if (n == null) return 0;
        return 1 + getLength(n.next);
    }

    /* palidrome result class */
    private static class PalindromeResult {
        private boolean result;
        private Node compareNode;

        private PalindromeResult(boolean result, Node compareNode) {
            this.result = result;
            this.compareNode = compareNode;
        }
    }
}
