package q6_palindrome;

import java.util.Stack;

/**
 * Created by jjlee on 7/31/16.
 */
public class QuestionB {
    /* iterative with stack and get length */
    public static boolean isPalindromeIterative(Node n) {
        int length = getLength(n);
        Stack s = new Stack();
        for (int i = 0; i < length; i++) {
            if (i * 2 < length - 1) s.push(n.data);
            else if (i * 2 > length - 1)
                if (!n.data.equals(s.pop())) return false;
            n = n.next;
        }
        return true;
    }

    /* gets length of given list */
    private static int getLength(Node n) {
        if (n == null) return 0;
        return 1 + getLength(n.next);
    }
}
