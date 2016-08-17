package q6_palindrome;

import org.testng.annotations.*;
import utils.Node;

import static org.testng.Assert.*;
import static q6_palindrome.QuestionA.*;
import static q6_palindrome.QuestionB.*;
import static q6_palindrome.QuestionC.*;
import static q6_palindrome.QuestionD.*;

/**
 * Created by jjlee on 7/31/16.
 */
public class Tester {
    Node<Integer> a1, a2, a3, a4, a5, a6, c1, c2, c3, c4, c5, c6;
    Node<Character> b1, b2, b3, b4, b5;

    @BeforeMethod
    public void setup() throws Exception {
        a1 = new Node<>(1);
        a2 = new Node<>(2);
        a3 = new Node<>(3);
        a4 = new Node<>(3);
        a5 = new Node<>(2);
        a6 = new Node<>(1);
        a1.next =a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        b1 = new Node<>('a');
        b2 = new Node<>('b');
        b3 = new Node<>('c');
        b4 = new Node<>('b');
        b5 = new Node<>('a');
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        c1 = new Node<>(1);
        c2 = new Node<>(2);
        c3 = new Node<>(3);
        c4 = new Node<>(3);
        c5 = new Node<>(3);
        c6 = new Node<>(2);
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = c6;
    }

    @Test
    public void testIsPalindrome() throws Exception {
        boolean isPalindrome1 = isPalindrome(a1);
        assertTrue(isPalindrome1);
        boolean isPalindrome2 = isPalindrome(b1);
        assertTrue(isPalindrome2);
        boolean isPalindrome3 = isPalindrome(c1);
        assertFalse(isPalindrome3);
    }

    @Test
    public void testIsPalindromeIterative() throws Exception {
        boolean isPalindrome1 = isPalindromeIterative(a1);
        assertTrue(isPalindrome1);
        boolean isPalindrome2 = isPalindromeIterative(b1);
        assertTrue(isPalindrome2);
        boolean isPalindrome3 = isPalindromeIterative(c1);
        assertFalse(isPalindrome3);
    }

    @Test
    public void testIsPalindromeRecursive() throws Exception {
        boolean isPalindrome1 = isPalindromeRecursive(a1);
        assertTrue(isPalindrome1);
        boolean isPalindrome2 = isPalindromeRecursive(b1);
        assertTrue(isPalindrome2);
        boolean isPalindrome3 = isPalindromeRecursive(c1);
        assertFalse(isPalindrome3);
    }

    @Test
    public void testIsPalindromeIterativeRunners() throws Exception {
        boolean isPalindrome1 = isPalindromeIterativeRunners(a1);
        assertTrue(isPalindrome1);
        boolean isPalindrome2 = isPalindromeIterativeRunners(b1);
        assertTrue(isPalindrome2);
        boolean isPalindrome3 = isPalindromeIterativeRunners(c1);
        assertFalse(isPalindrome3);
    }

}