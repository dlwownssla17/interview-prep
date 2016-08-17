package q3_delete_middle_node;

import org.testng.annotations.*;
import utils.Node;

import java.util.Arrays;

import static org.testng.Assert.*;
import static q3_delete_middle_node.Question.*;

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
    public void testDeleteNode() throws Exception {
        deleteNode(c);
        int[] arr = Arrays.stream(a.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr = new int[] {1, 2, 4, 5};
        assertEquals(arr, testArr);
    }

}