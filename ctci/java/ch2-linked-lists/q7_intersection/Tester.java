package q7_intersection;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q7_intersection.Question.*;

/**
 * Created by jjlee on 8/7/16.
 */
public class Tester {
    @Test
    public void testFindIntersection() throws Exception {
        Node<Integer> a = new Node(1);
        Node<Integer> b = new Node(2);
        Node<Integer> c = new Node(3);
        Node<Integer> d = new Node(4);
        Node<Integer> e = new Node(5);
        Node<Integer> f = new Node(6);
        a.next = b;
        b.next = c;
        d.next = c;
        c.next = e;
        e.next = f;
        Node intersection1 = findIntersection(a, d);
        assertEquals(intersection1, c);

        Node<Integer> g = new Node(7);
        Node<Integer> h = new Node(8);
        Node<Integer> i = new Node(9);
        Node<Integer> j = new Node(10);
        Node<Integer> k = new Node(11);
        g.next = h;
        h.next = i;
        j.next = k;
        k.next = i;
        Node intersection2 = findIntersection(g, j);
        assertEquals(intersection2, i);

        Node<Integer> l = new Node(12);
        Node<Integer> m = new Node(13);
        Node<Integer> n = new Node(14);
        Node<Integer> o = new Node(15);
        l.next = m;
        m.next = n;
        n.next = o;
        Node intersection3 = findIntersection(l, l);
        assertEquals(intersection3, l);

        Node<Integer> p = new Node(16);
        Node<Integer> q = new Node(17);
        Node<Integer> r = new Node(18);
        Node<Integer> s = new Node(19);
        Node<Integer> t = new Node(20);
        Node<Integer> u = new Node(21);
        p.next = q;
        r.next = s;
        s.next = t;
        t.next = u;
        Node intersection4 = findIntersection(p, r);
        assertNull(intersection4);

        Node<Integer> v = new Node(22);
        Node<Integer> w = new Node(23);
        Node<Integer> x = new Node(24);
        Node<Integer> y = new Node(25);
        Node<Integer> z = new Node(26);
        v.next = w;
        w.next = x;
        x.next = y;
        y.next = z;
        Node intersection5 = findIntersection(v, null);
        assertNull(intersection5);
    }

}