package q5_sum_lists;

import org.testng.annotations.*;
import utils.Node;

import java.util.Arrays;

import static org.testng.Assert.*;
import static q5_sum_lists.QuestionA.*;
import static q5_sum_lists.QuestionB.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    Node<Integer> a1, a2, a3, b1, b2, b3, c1, d1, d2, d3, d4, e1, f1, f2, g1, g2, g3, h1, h2, h3, i1, j1, j2, j3, j4,
            k1, l1, l2, m1, m2, n1, n2, n3, n4;

    @BeforeMethod
    public void setup() throws Exception {
        a1 = new Node<>(7);
        a2 = new Node<>(1);
        a3 = new Node<>(6);
        b1 = new Node<>(5);
        b2 = new Node<>(9);
        b3 = new Node<>(2);
        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = b3;
        c1 = new Node<>(1);
        d1 = new Node<>(0);
        d2 = new Node<>(0);
        d3 = new Node<>(0);
        d4 = new Node<>(1);
        d1.next = d2;
        d2.next = d3;
        d3.next = d4;
        e1 = new Node<>(1);
        f1 = new Node<>(9);
        f2 = new Node<>(9);
        f1.next = f2;
        g1 = new Node<>(6);
        g2 = new Node<>(1);
        g3 = new Node<>(7);
        h1 = new Node<>(2);
        h2 = new Node<>(9);
        h3 = new Node<>(5);
        g1.next = g2;
        g2.next = g3;
        h1.next = h2;
        h2.next = h3;
        i1 = new Node<>(1);
        j1 = new Node<>(1);
        j2 = new Node<>(0);
        j3 = new Node<>(0);
        j4 = new Node<>(0);
        j1.next = j2;
        j2.next = j3;
        j3.next = j4;
        k1 = new Node<>(1);
        l1 = new Node<>(9);
        l2 = new Node<>(9);
        l1.next = l2;
        m1 = new Node<>(1);
        m2 = new Node<>(1);
        n1 = new Node<>(1);
        n2 = new Node<>(0);
        n3 = new Node<>(0);
        n4 = new Node<>(0);
        m1.next = m2;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }

    @Test
    public void testSumLists() throws Exception {
        Node<Integer> sum1 = sumLists(a1, b1);
        int[] arr1 = Arrays.stream(sum1.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr1 = new int[] {2, 1, 9};
        assertEquals(arr1, testArr1);

        Node<Integer> sum2 = sumLists(c1, d1);
        int[] arr2 = Arrays.stream(sum2.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr2 = new int[] {1, 0, 0, 1};
        assertEquals(arr2, testArr2);

        Node<Integer> sum3 = sumLists(e1, f1);
        int[] arr3 = Arrays.stream(sum3.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr3 = new int[] {0, 0, 1};
        assertEquals(arr3, testArr3);
    }

    @Test
    public void testSumListsForwardOrder() throws Exception {
        Node<Integer> sum1 = sumListsForwardOrder(g1, h1);
        int[] arr1 = Arrays.stream(sum1.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr1 = new int[] {9, 1, 2};
        assertEquals(arr1, testArr1);

        Node<Integer> sum2 = sumListsForwardOrder(i1, j1);
        int[] arr2 = Arrays.stream(sum2.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr2 = new int[] {1, 0, 0, 1};
        assertEquals(arr2, testArr2);

        Node<Integer> sum3 = sumListsForwardOrder(k1, l1);
        int[] arr3 = Arrays.stream(sum3.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr3 = new int[] {1, 0, 0};
        assertEquals(arr3, testArr3);

        Node<Integer> sum4 = sumListsForwardOrder(m1, n1);
        int[] arr4 = Arrays.stream(sum4.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr4 = new int[] {1, 0, 1, 1};
        assertEquals(arr4, testArr4);
    }
}