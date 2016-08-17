package q8_loop_detection;

import org.testng.annotations.*;
import utils.Node;

import static org.testng.Assert.*;
import static q8_loop_detection.Question.*;

/**
 * Created by jjlee on 8/7/16.
 */
public class Tester {
    Node<Integer> a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q;

    @BeforeMethod
    public void setup() throws Exception {
        a = new Node<>(1);
        b = new Node<>(2);
        c = new Node<>(3);
        d = new Node<>(4);
        e = new Node<>(5);
        f = new Node<>(6);
        g = new Node<>(7);
        h = new Node<>(8);
        i = new Node<>(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = d;
        j = new Node<>(10);
        k = new Node<>(11);
        l = new Node<>(12);
        m = new Node<>(13);
        n = new Node<>(14);
        j.next = k;
        k.next = l;
        l.next = m;
        m.next = n;
        n.next = j;
        o = new Node<>(15);
        p = new Node<>(16);
        q = new Node<>(17);
        o.next = p;
        p.next = q;
        q.next = q;
    }

    @Test
    public void testDetectLoopBeginning() throws Exception {
        Node loopBeginning1 = detectLoopBeginning(a);
        assertEquals(loopBeginning1, d);
        Node loopBeginning2 = detectLoopBeginning(j);
        assertEquals(loopBeginning2, j);
        Node loopBeginning3 = detectLoopBeginning(o);
        assertEquals(loopBeginning3, q);
    }

}