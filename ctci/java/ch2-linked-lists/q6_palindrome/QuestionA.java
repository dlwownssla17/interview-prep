package q6_palindrome;

import static q6_palindrome.ListReverse.*;

/**
 * Created by jjlee on 7/31/16.
 */
public class QuestionA {
    /* check with the reverse of the list */
    public static boolean isPalindrome(Node n) {
        return identical(n, reverse(copy(n)));
    }

    /* copy the given list */
    private static Node copy(Node n) {
        if (n == null) return null;

        Node remainder = copy(n.next);
        Node newN = new Node(n.data);
        newN.next = remainder;
        return newN;
    }

    /* check if the given lists are identical */
    private static boolean identical(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return (a.data.equals(b.data)) && identical(a.next, b.next);
    }

    /* check if the given lists are identical (iterative) */
    private static boolean identicalIterative(Node a, Node b) {
        while (a != null && b != null) {
            if (!a.data.equals(b.data)) return false;
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }
}
