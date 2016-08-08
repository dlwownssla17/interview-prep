package q2_stack_min;

import org.testng.annotations.Test;

import java.util.EmptyStackException;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/7/16.
 */
public class Tester {
    @Test
    public void testMinStack() throws Exception {
        MinStack<Integer> s = new MinStack<>();
        try { s.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.peek(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.min(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        s.push(2);
        assertEquals((int) s.peek(), 2);
        assertEquals((int) s.min(), 2);
        s.push(4);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.min(), 2);
        s.push(4);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.min(), 2);
        s.push(3);
        assertEquals((int) s.peek(), 3);
        assertEquals((int) s.min(), 2);
        s.push(2);
        assertEquals((int) s.peek(), 2);
        assertEquals((int) s.min(), 2);
        s.push(1);
        assertEquals((int) s.peek(), 1);
        assertEquals((int) s.min(), 1);
        s.push(5);
        assertEquals((int) s.peek(), 5);
        assertEquals((int) s.min(), 1);
        assertEquals((int) s.pop(), 5);
        assertEquals((int) s.peek(), 1);
        assertEquals((int) s.min(), 1);
        assertEquals((int) s.pop(), 1);
        assertEquals((int) s.peek(), 2);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 2);
        assertEquals((int) s.peek(), 3);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 3);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 4);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 4);
        assertEquals((int) s.peek(), 2);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 2);
        try { s.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.peek(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.min(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
    }

    @Test
    public void testMinStack2() throws Exception {
        MinStack2<Integer> s = new MinStack2<>();
        try { s.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.peek(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.min(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        s.push(2);
        assertEquals((int) s.peek(), 2);
        assertEquals((int) s.min(), 2);
        s.push(4);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.min(), 2);
        s.push(4);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.min(), 2);
        s.push(3);
        assertEquals((int) s.peek(), 3);
        assertEquals((int) s.min(), 2);
        s.push(2);
        assertEquals((int) s.peek(), 2);
        assertEquals((int) s.min(), 2);
        s.push(1);
        assertEquals((int) s.peek(), 1);
        assertEquals((int) s.min(), 1);
        s.push(5);
        assertEquals((int) s.peek(), 5);
        assertEquals((int) s.min(), 1);
        assertEquals((int) s.pop(), 5);
        assertEquals((int) s.peek(), 1);
        assertEquals((int) s.min(), 1);
        assertEquals((int) s.pop(), 1);
        assertEquals((int) s.peek(), 2);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 2);
        assertEquals((int) s.peek(), 3);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 3);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 4);
        assertEquals((int) s.peek(), 4);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 4);
        assertEquals((int) s.peek(), 2);
        assertEquals((int) s.min(), 2);
        assertEquals((int) s.pop(), 2);
        try { s.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.peek(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.min(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
    }
}