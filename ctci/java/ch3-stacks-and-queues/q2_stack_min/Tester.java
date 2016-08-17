package q2_stack_min;

import org.testng.annotations.*;
import java.util.EmptyStackException;
import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/7/16.
 */
public class Tester {
    MinStack<Integer> s;
    MinStack2<Integer> s2;

    @BeforeMethod
    public void setup() throws Exception {
        s = new MinStack<>();
        s2 = new MinStack2<>();
    }

    @Test
    public void testMinStack() throws Exception {
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
        try { s2.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s2.peek(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s2.min(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        s2.push(2);
        assertEquals((int) s2.peek(), 2);
        assertEquals((int) s2.min(), 2);
        s2.push(4);
        assertEquals((int) s2.peek(), 4);
        assertEquals((int) s2.min(), 2);
        s2.push(4);
        assertEquals((int) s2.peek(), 4);
        assertEquals((int) s2.min(), 2);
        s2.push(3);
        assertEquals((int) s2.peek(), 3);
        assertEquals((int) s2.min(), 2);
        s2.push(2);
        assertEquals((int) s2.peek(), 2);
        assertEquals((int) s2.min(), 2);
        s2.push(1);
        assertEquals((int) s2.peek(), 1);
        assertEquals((int) s2.min(), 1);
        s2.push(5);
        assertEquals((int) s2.peek(), 5);
        assertEquals((int) s2.min(), 1);
        assertEquals((int) s2.pop(), 5);
        assertEquals((int) s2.peek(), 1);
        assertEquals((int) s2.min(), 1);
        assertEquals((int) s2.pop(), 1);
        assertEquals((int) s2.peek(), 2);
        assertEquals((int) s2.min(), 2);
        assertEquals((int) s2.pop(), 2);
        assertEquals((int) s2.peek(), 3);
        assertEquals((int) s2.min(), 2);
        assertEquals((int) s2.pop(), 3);
        assertEquals((int) s2.peek(), 4);
        assertEquals((int) s2.min(), 2);
        assertEquals((int) s2.pop(), 4);
        assertEquals((int) s2.peek(), 4);
        assertEquals((int) s2.min(), 2);
        assertEquals((int) s2.pop(), 4);
        assertEquals((int) s2.peek(), 2);
        assertEquals((int) s2.min(), 2);
        assertEquals((int) s2.pop(), 2);
        try { s2.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s2.peek(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s2.min(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
    }
}