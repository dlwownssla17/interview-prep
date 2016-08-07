package q8_loop_detection;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q8_loop_detection.Question.*;

/**
 * Created by jjlee on 8/7/16.
 */
public class Tester {
    @Test
    public void testDetectLoopBeginning() throws Exception {
        Node<Integer> a = new Node(1);
        Node<Integer> b = new Node(2);
        Node<Integer> c = new Node(3);
        Node<Integer> d = new Node(4);
        Node<Integer> e = new Node(5);
        Node<Integer> f = new Node(6);
        Node<Integer> g = new Node(7);
        Node<Integer> h = new Node(8);
        Node<Integer> i = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = d;
        Node loopBeginning1 = detectLoopBeginning(a);
        assertEquals(loopBeginning1, d);

        Node<Integer> j = new Node(10);
        Node<Integer> k = new Node(11);
        Node<Integer> l = new Node(12);
        Node<Integer> m = new Node(13);
        Node<Integer> n = new Node(14);
        j.next = k;
        k.next = l;
        l.next = m;
        m.next = n;
        n.next = j;
        Node loopBeginning2 = detectLoopBeginning(j);
        assertEquals(loopBeginning2, j);

        Node<Integer> o = new Node(15);
        Node<Integer> p = new Node(16);
        Node<Integer> q = new Node(17);
        o.next = p;
        p.next = q;
        q.next = q;
        Node loopBeginning3 = detectLoopBeginning(o);
        assertEquals(loopBeginning3, q);
    }

}