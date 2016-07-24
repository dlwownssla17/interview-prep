package q2_return_kth_to_last;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q2_return_kth_to_last.Question.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    @Test
    public void testReturnKthToLast() throws Exception {
        Node<Integer> a = new Node(1);
        Node<Integer> b = new Node(2);
        Node<Integer> c = new Node(3);
        Node<Integer> d = new Node(4);
        Node<Integer> e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node testNode = returnKthToLast(a, 1);
        assertEquals(testNode, d);
    }

}