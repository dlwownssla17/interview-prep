package q6_palindrome;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q6_palindrome.ListReverse.*;

/**
 * Created by jjlee on 7/31/16.
 */
public class TesterListReverse {
    @Test
    public void testReverse() throws Exception {
        Node<Integer> a = new Node(1);
        Node<Integer> b = new Node(2);
        Node<Integer> c = new Node(3);
        Node<Integer> d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;

        Node<Integer> head = reverse(a);

        int[] arr = new int[4];
        int[] testArr = new int[] {4, 3, 2, 1};
        int incr = 0;
        Node<Integer> testNode = head;
        while (testNode != null) {
            arr[incr] = testNode.data;
            incr++;
            testNode = testNode.next;
        }
        assertEquals(arr, testArr);
    }

    @Test
    public void testReverseIterative() throws Exception {
        Node<Integer> a = new Node(1);
        Node<Integer> b = new Node(2);
        Node<Integer> c = new Node(3);
        Node<Integer> d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;

        Node<Integer> head = reverseIterative(a);

        int[] arr = new int[4];
        int[] testArr = new int[] {4, 3, 2, 1};
        int incr = 0;
        Node<Integer> testNode = head;
        while (testNode != null) {
            arr[incr] = testNode.data;
            incr++;
            testNode = testNode.next;
        }
        assertEquals(arr, testArr);
    }

}
