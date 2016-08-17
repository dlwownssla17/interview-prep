package q1_remove_dups;

import org.testng.annotations.*;
import utils.Node;

import java.util.Arrays;

import static org.testng.Assert.*;
import static q1_remove_dups.QuestionA.*;
import static q1_remove_dups.QuestionB.*;

/**
 * Created by jjlee on 7/23/16.
 */
public class Tester {
    Node<Integer> a, b, c, d, e, f, g, h;

    @BeforeMethod
    public void setup() throws Exception {
        a = new Node<>(1);
        b = new Node<>(2);
        c = new Node<>(1);
        d = new Node<>(3);
        e = new Node<>(3);
        f = new Node<>(4);
        g = new Node<>(2);
        h = new Node<>(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
    }

    @Test
    public void testRemoveDups() throws Exception {
        removeDups(a);
        int[] arr = Arrays.stream(a.toArray()).mapToInt(Integer::intValue).toArray();
        int[] testArr = new int[] {1, 2, 3, 4};
        assertEquals(arr, testArr);
    }

    @Test
    public void testRemoveDupsNoTemporaryBuffer() throws Exception {
        removeDupsNoTemporaryBuffer(a);
        int[] arr = Arrays.stream(a.toArray()).mapToInt(Integer::intValue).toArray();;
        int[] testArr = new int[] {1, 2, 3, 4};
        assertEquals(arr, testArr);
    }

}