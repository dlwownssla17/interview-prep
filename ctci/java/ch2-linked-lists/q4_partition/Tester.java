package q4_partition;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q4_partition.Question.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    @Test
    public void testPartition1() throws Exception {
        Node<Integer> a = new Node(3);
        Node<Integer> b = new Node(5);
        Node<Integer> c = new Node(8);
        Node<Integer> d = new Node(5);
        Node<Integer> e = new Node(10);
        Node<Integer> f = new Node(2);
        Node<Integer> g = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node<Integer> head = partition(a, 5);

        int[] arr = new int[7];
        int[] testArr = new int[] {3, 2, 1, 5, 8, 5, 10};
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
    public void testPartition2() throws Exception {
        Node<Integer> a = new Node(5);
        Node<Integer> b = new Node(5);
        Node<Integer> c = new Node(8);
        Node<Integer> d = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;

        Node<Integer> head = partition(a, 5);

        int[] arr = new int[4];
        int[] testArr = new int[] {2, 5, 5, 8};
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
    public void testPartitionTwoDummyNodes1() throws Exception {
        Node<Integer> a = new Node(3);
        Node<Integer> b = new Node(5);
        Node<Integer> c = new Node(8);
        Node<Integer> d = new Node(5);
        Node<Integer> e = new Node(10);
        Node<Integer> f = new Node(2);
        Node<Integer> g = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node<Integer> head = partitionTwoDummyNodes(a, 5);

        int[] arr = new int[7];
        int[] testArr = new int[] {3, 2, 1, 5, 8, 5, 10};
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
    public void testPartitionTwoDummyNodes2() throws Exception {
        Node<Integer> a = new Node(5);
        Node<Integer> b = new Node(5);
        Node<Integer> c = new Node(8);
        Node<Integer> d = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;

        Node<Integer> head = partitionTwoDummyNodes(a, 5);

        int[] arr = new int[4];
        int[] testArr = new int[] {2, 5, 5, 8};
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