package q5_sum_lists;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q5_sum_lists.QuestionA.*;
import static q5_sum_lists.QuestionB.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    @Test
    public void testSumLists() throws Exception {
        Node<Integer> a1 = new Node(7);
        Node<Integer> a2 = new Node(1);
        Node<Integer> a3 = new Node(6);
        Node<Integer> b1 = new Node(5);
        Node<Integer> b2 = new Node(9);
        Node<Integer> b3 = new Node(2);
        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = b3;

        Node<Integer> sum1 = sumLists(a1, b1);

        int[] arr1 = new int[3];
        int[] testArr1 = new int[] {2, 1, 9};
        int incr1 = 0;
        Node<Integer> testNode1 = sum1;
        while (testNode1 != null) {
            arr1[incr1] = testNode1.data;
            incr1++;
            testNode1 = testNode1.next;
        }
        assertEquals(arr1, testArr1);

        Node<Integer> c1 = new Node(1);
        Node<Integer> d1 = new Node(0);
        Node<Integer> d2 = new Node(0);
        Node<Integer> d3 = new Node(0);
        Node<Integer> d4 = new Node(1);
        d1.next = d2;
        d2.next = d3;
        d3.next = d4;

        Node<Integer> sum2 = sumLists(c1, d1);

        int[] arr2 = new int[4];
        int[] testArr2 = new int[] {1, 0, 0, 1};
        int incr2 = 0;
        Node<Integer> testNode2 = sum2;
        while (testNode2 != null) {
            arr2[incr2] = testNode2.data;
            incr2++;
            testNode2 = testNode2.next;
        }
        assertEquals(arr2, testArr2);

        Node<Integer> e1 = new Node(1);
        Node<Integer> f1 = new Node(9);
        Node<Integer> f2 = new Node(9);
        f1.next = f2;

        Node<Integer> sum3 = sumLists(e1, f1);

        int[] arr3 = new int[3];
        int[] testArr3 = new int[] {0, 0, 1};
        int incr3 = 0;
        Node<Integer> testNode3 = sum3;
        while (testNode3 != null) {
            arr3[incr3] = testNode3.data;
            incr3++;
            testNode3 = testNode3.next;
        }
        assertEquals(arr3, testArr3);
    }

    @Test
    public void testSumListsPrune() throws Exception {

    }

    @Test
    public void testSumListsForwardOrder() throws Exception {

    }

}