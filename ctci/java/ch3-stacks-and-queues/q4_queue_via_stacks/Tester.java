package q4_queue_via_stacks;

import org.testng.annotations.*;

import java.util.NoSuchElementException;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/16/16.
 */
public class Tester {
    MyQueue<Integer> q;
    MyQueue2<Integer> q2;

    @BeforeMethod
    public void setup() throws Exception {
        q = new MyQueue<>();
        q2 = new MyQueue2<>();
    }

    @Test
    public void testMyQueue() throws Exception {
        try { q.remove(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { q.peek(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        q.add(0);
        q.add(1);
        q.add(2);
        assertEquals((int) q.remove(), 0);
        assertEquals((int) q.peek(), 1);
        q.add(3);
        q.add(4);
        assertEquals((int) q.peek(), 1);
        q.add(5);
        q.add(6);
        assertEquals((int) q.remove(), 1);
        assertEquals((int) q.remove(), 2);
        assertEquals((int) q.peek(), 3);
        assertEquals((int) q.remove(), 3);
        assertEquals((int) q.remove(), 4);
        assertEquals((int) q.remove(), 5);
        q.add(7);
        assertEquals((int) q.remove(), 6);
        assertEquals((int) q.peek(), 7);
        assertEquals((int) q.remove(), 7);
        try { q.remove(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { q.peek(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
    }

    @Test
    public void testMyQueue2() throws Exception {
        try { q2.remove(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { q2.peek(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        q2.add(0);
        q2.add(1);
        q2.add(2);
        assertEquals((int) q2.remove(), 0);
        assertEquals((int) q2.peek(), 1);
        q2.add(3);
        q2.add(4);
        assertEquals((int) q2.peek(), 1);
        q2.add(5);
        q2.add(6);
        assertEquals((int) q2.remove(), 1);
        assertEquals((int) q2.remove(), 2);
        assertEquals((int) q2.peek(), 3);
        assertEquals((int) q2.remove(), 3);
        assertEquals((int) q2.remove(), 4);
        assertEquals((int) q2.remove(), 5);
        q2.add(7);
        assertEquals((int) q2.remove(), 6);
        assertEquals((int) q2.peek(), 7);
        assertEquals((int) q2.remove(), 7);
        try { q2.remove(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { q2.peek(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
    }
}