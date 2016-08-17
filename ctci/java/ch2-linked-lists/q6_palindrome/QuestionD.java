package q6_palindrome;

import utils.Node;

import java.util.Stack;

/**
 * Created by jjlee on 7/31/16.
 */
public class QuestionD {
    /* iterative with stack and runners */
    public static boolean isPalindromeIterativeRunners(Node n) {
        Stack s = new Stack();
        Node slowRunner = n;
        Node fastRunner = n;
        while (fastRunner != null && fastRunner.next != null) {
            s.push(slowRunner.data);
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }
        if (fastRunner != null) slowRunner = slowRunner.next;
        while (slowRunner != null) {
            if (!slowRunner.data.equals(s.pop())) return false;
            slowRunner = slowRunner.next;
        }
        return true;
    }
}
