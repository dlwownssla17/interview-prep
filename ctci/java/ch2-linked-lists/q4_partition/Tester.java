package q4_partition;

import org.testng.annotations.*;
import utils.Node;

import java.util.Arrays;

import static org.testng.Assert.*;
import static q4_partition.Question.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    Node<Integer> a, b, c, d, e, f, g, h, i, j, k;

    @BeforeMethod
    public void setup() throws Exception {
        a = new Node<>(3);
        b = new Node<>(5);
        c = new Node<>(8);
        d = new Node<>(5);
        e = new Node<>(10);
        f = new Node<>(2);
        g = new Node<>(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        h = new Node<>(5);
        i = new Node<>(5);
        j = new Node<>(8);
        k = new Node<>(2);
        h.next = i;
        i.next = j;
        j.next = k;
    }

    @Test
    public void testPartition1() throws Exception {
        Node<Integer> head = partition(a, 5);
        int[] arr = Arrays.stream(head.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr = new int[] {3, 2, 1, 5, 8, 5, 10};
        assertEquals(arr, testArr);
    }

    @Test
    public void testPartition2() throws Exception {
        Node<Integer> head = partition(h, 5);
        int[] arr = Arrays.stream(head.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr = new int[] {2, 5, 5, 8};
        assertEquals(arr, testArr);
    }

    @Test
    public void testPartitionTwoDummyNodes1() throws Exception {
        Node<Integer> head = partitionTwoDummyNodes(a, 5);
        int[] arr = Arrays.stream(head.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr = new int[] {3, 2, 1, 5, 8, 5, 10};
        assertEquals(arr, testArr);
    }

    @Test
    public void testPartitionTwoDummyNodes2() throws Exception {
        Node<Integer> head = partitionTwoDummyNodes(h, 5);
        int[] arr = Arrays.stream(head.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr = new int[] {2, 5, 5, 8};
        assertEquals(arr, testArr);
    }

}