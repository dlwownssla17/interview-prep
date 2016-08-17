package q2_return_kth_to_last;

import org.testng.annotations.*;
import utils.Node;

import static org.testng.Assert.*;
import static q2_return_kth_to_last.Question.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    Node<Integer> a, b, c, d, e;

    @BeforeMethod
    public void setup() throws Exception {
        a = new Node<>(1);
        b = new Node<>(2);
        c = new Node<>(3);
        d = new Node<>(4);
        e = new Node<>(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
    }

    @Test
    public void testReturnKthToLast() throws Exception {
        Node testNode = returnKthToLast(a, 1);
        assertEquals(testNode, d);
    }

}