package q1_remove_dups;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q1_remove_dups.QuestionA.*;
import static q1_remove_dups.QuestionB.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    @Test
    public void testRemoveDups() throws Exception {
        Node<Integer> a = new Node(1);
        Node<Integer> b = new Node(2);
        Node<Integer> c = new Node(1);
        Node<Integer> d = new Node(3);
        Node<Integer> e = new Node(3);
        Node<Integer> f = new Node(4);
        Node<Integer> g = new Node(2);
        Node<Integer> h = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        removeDups(a);

        int[] arr = new int[4];
        int[] testArr = new int[] {1, 2, 3, 4};
        int i = 0;
        Node<Integer> testNode = a;
        while (testNode != null) {
            arr[i] = testNode.data;
            i++;
            testNode = testNode.next;
        }
        assertEquals(arr, testArr);
    }

    @Test
    public void testRemoveDupsNoTemporaryBuffer() throws Exception {
        Node<Integer> a = new Node(1);
        Node<Integer> b = new Node(2);
        Node<Integer> c = new Node(1);
        Node<Integer> d = new Node(3);
        Node<Integer> e = new Node(3);
        Node<Integer> f = new Node(4);
        Node<Integer> g = new Node(2);
        Node<Integer> h = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        removeDupsNoTemporaryBuffer(a);

        int[] arr = new int[4];
        int[] testArr = new int[] {1, 2, 3, 4};
        int i = 0;
        Node<Integer> testNode = a;
        while (testNode != null) {
            arr[i] = testNode.data;
            i++;
            testNode = testNode.next;
        }
        assertEquals(arr, testArr);
    }

}