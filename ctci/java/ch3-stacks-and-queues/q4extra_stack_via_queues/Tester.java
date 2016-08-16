package q4extra_stack_via_queues;

import org.testng.annotations.Test;

import java.util.EmptyStackException;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/16/16.
 */
public class Tester {
    @Test
    public void testMyStack() throws Exception {
        MyStack<Integer> s = new MyStack<>();
        assertTrue(s.isEmpty());
        try { s.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.peek(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        s.push(0);
        s.push(1);
        s.push(2);
        assertEquals((int) s.pop(), 2);
        assertEquals((int) s.peek(), 1);
        s.push(3);
        s.push(4);
        assertEquals((int) s.peek(), 4);
        s.push(5);
        s.push(6);
        assertEquals((int) s.pop(), 6);
        assertEquals((int) s.pop(), 5);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.pop(), 4);
        assertEquals((int) s.pop(), 3);
        assertEquals((int) s.pop(), 1);
        s.push(7);
        assertEquals((int) s.pop(), 7);
        assertEquals((int) s.peek(), 0);
        assertEquals((int) s.pop(), 0);
        assertTrue(s.isEmpty());
        try { s.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.peek(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
    }
}