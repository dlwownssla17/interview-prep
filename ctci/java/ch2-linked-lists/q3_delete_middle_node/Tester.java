package q3_delete_middle_node;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q3_delete_middle_node.Question.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    @Test
    public void testDeleteNode() throws Exception {
        Node<Integer> a = new Node(1);
        Node<Integer> b = new Node(2);
        Node<Integer> c = new Node(3);
        Node<Integer> d = new Node(4);
        Node<Integer> e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        deleteNode(c);

        int[] arr = new int[4];
        int[] testArr = new int[] {1, 2, 4, 5};
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