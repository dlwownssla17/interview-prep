package q6_palindrome;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q6_palindrome.QuestionA.*;
import static q6_palindrome.QuestionB.*;
import static q6_palindrome.QuestionC.*;
import static q6_palindrome.QuestionD.*;

/**
 * Created by jjlee on 7/31/16.
 */
public class Tester {
    @Test
    public void testIsPalindrome() throws Exception {
        Node<Integer> a1 = new Node(1);
        Node<Integer> a2 = new Node(2);
        Node<Integer> a3 = new Node(3);
        Node<Integer> a4 = new Node(3);
        Node<Integer> a5 = new Node(2);
        Node<Integer> a6 = new Node(1);
        a1.next =a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        boolean isPalindrome1 = isPalindrome(a1);
        assertTrue(isPalindrome1);

        Node<Character> b1 = new Node('a');
        Node<Character> b2 = new Node('b');
        Node<Character> b3 = new Node('c');
        Node<Character> b4 = new Node('b');
        Node<Character> b5 = new Node('a');
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;

        boolean isPalindrome2 = isPalindrome(b1);
        assertTrue(isPalindrome2);

        Node<Integer> c1 = new Node(1);
        Node<Integer> c2 = new Node(2);
        Node<Integer> c3 = new Node(3);
        Node<Integer> c4 = new Node(3);
        Node<Integer> c5 = new Node(3);
        Node<Integer> c6 = new Node(2);
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = c6;

        boolean isPalindrome3 = isPalindrome(c1);
        assertFalse(isPalindrome3);
    }

    @Test
    public void testIsPalindromeIterative() throws Exception {
        Node<Integer> a1 = new Node(1);
        Node<Integer> a2 = new Node(2);
        Node<Integer> a3 = new Node(3);
        Node<Integer> a4 = new Node(3);
        Node<Integer> a5 = new Node(2);
        Node<Integer> a6 = new Node(1);
        a1.next =a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        boolean isPalindrome1 = isPalindromeIterative(a1);
        // assertTrue(isPalindrome1);

        Node<Character> b1 = new Node('a');
        Node<Character> b2 = new Node('b');
        Node<Character> b3 = new Node('c');
        Node<Character> b4 = new Node('b');
        Node<Character> b5 = new Node('a');
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;

        boolean isPalindrome2 = isPalindromeIterative(b1);
        // assertTrue(isPalindrome2);

        Node<Integer> c1 = new Node(1);
        Node<Integer> c2 = new Node(2);
        Node<Integer> c3 = new Node(3);
        Node<Integer> c4 = new Node(3);
        Node<Integer> c5 = new Node(3);
        Node<Integer> c6 = new Node(2);
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = c6;

        boolean isPalindrome3 = isPalindromeIterative(c1);
        // assertFalse(isPalindrome3);
    }

    @Test
    public void testIsPalindromeRecursive() throws Exception {
        Node<Integer> a1 = new Node(1);
        Node<Integer> a2 = new Node(2);
        Node<Integer> a3 = new Node(3);
        Node<Integer> a4 = new Node(3);
        Node<Integer> a5 = new Node(2);
        Node<Integer> a6 = new Node(1);
        a1.next =a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        boolean isPalindrome1 = isPalindromeRecursive(a1);
        // assertTrue(isPalindrome1);

        Node<Character> b1 = new Node('a');
        Node<Character> b2 = new Node('b');
        Node<Character> b3 = new Node('c');
        Node<Character> b4 = new Node('b');
        Node<Character> b5 = new Node('a');
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;

        boolean isPalindrome2 = isPalindromeRecursive(b1);
        // assertTrue(isPalindrome2);

        Node<Integer> c1 = new Node(1);
        Node<Integer> c2 = new Node(2);
        Node<Integer> c3 = new Node(3);
        Node<Integer> c4 = new Node(3);
        Node<Integer> c5 = new Node(3);
        Node<Integer> c6 = new Node(2);
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = c6;

        boolean isPalindrome3 = isPalindromeRecursive(c1);
        // assertFalse(isPalindrome3);
    }

    @Test
    public void testIsPalindromeIterativeRunners() throws Exception {
        Node<Integer> a1 = new Node(1);
        Node<Integer> a2 = new Node(2);
        Node<Integer> a3 = new Node(3);
        Node<Integer> a4 = new Node(3);
        Node<Integer> a5 = new Node(2);
        Node<Integer> a6 = new Node(1);
        a1.next =a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        boolean isPalindrome1 = isPalindromeIterativeRunners(a1);
        // assertTrue(isPalindrome1);

        Node<Character> b1 = new Node('a');
        Node<Character> b2 = new Node('b');
        Node<Character> b3 = new Node('c');
        Node<Character> b4 = new Node('b');
        Node<Character> b5 = new Node('a');
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;

        boolean isPalindrome2 = isPalindromeIterativeRunners(b1);
        // assertTrue(isPalindrome2);

        Node<Integer> c1 = new Node(1);
        Node<Integer> c2 = new Node(2);
        Node<Integer> c3 = new Node(3);
        Node<Integer> c4 = new Node(3);
        Node<Integer> c5 = new Node(3);
        Node<Integer> c6 = new Node(2);
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = c6;

        boolean isPalindrome3 = isPalindromeIterativeRunners(c1);
        // assertFalse(isPalindrome3);
    }

}