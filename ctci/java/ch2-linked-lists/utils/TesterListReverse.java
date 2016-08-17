package utils;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import static utils.ListReverse.*;

/**
 * Created by jjlee on 7/31/16.
 */
public class TesterListReverse {
    Node<Integer> a, b, c, d;

    @BeforeMethod
    public void setup() throws Exception {
        a = new Node(1);
        b = new Node(2);
        c = new Node(3);
        d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
    }

    @Test
    public void testReverse() throws Exception {
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
