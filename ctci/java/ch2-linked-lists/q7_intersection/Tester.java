package q7_intersection;

import org.testng.annotations.*;
import utils.Node;

import static org.testng.Assert.*;
import static q7_intersection.Question.*;

/**
 * Created by jjlee on 8/7/16.
 */
public class Tester {
    Node<Integer> a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

    @BeforeMethod
    public void setup() throws Exception {
        a = new Node<>(1);
        b = new Node<>(2);
        c = new Node<>(3);
        d = new Node<>(4);
        e = new Node<>(5);
        f = new Node<>(6);
        a.next = b;
        b.next = c;
        d.next = c;
        c.next = e;
        e.next = f;
        g = new Node<>(7);
        h = new Node<>(8);
        i = new Node<>(9);
        j = new Node<>(10);
        k = new Node<>(11);
        g.next = h;
        h.next = i;
        j.next = k;
        k.next = i;
        l = new Node<>(12);
        m = new Node<>(13);
        n = new Node<>(14);
        o = new Node<>(15);
        l.next = m;
        m.next = n;
        n.next = o;
        p = new Node<>(16);
        q = new Node<>(17);
        r = new Node<>(18);
        s = new Node<>(19);
        t = new Node<>(20);
        u = new Node<>(21);
        p.next = q;
        r.next = s;
        s.next = t;
        t.next = u;
        v = new Node<>(22);
        w = new Node<>(23);
        x = new Node<>(24);
        y = new Node<>(25);
        z = new Node<>(26);
        v.next = w;
        w.next = x;
        x.next = y;
        y.next = z;
    }

    @Test
    public void testFindIntersection() throws Exception {
        Node intersection1 = findIntersection(a, d);
        assertEquals(intersection1, c);
        Node intersection2 = findIntersection(g, j);
        assertEquals(intersection2, i);
        Node intersection3 = findIntersection(l, l);
        assertEquals(intersection3, l);
        Node intersection4 = findIntersection(p, r);
        assertNull(intersection4);
        Node intersection5 = findIntersection(v, null);
        assertNull(intersection5);
    }

}