package q1_three_in_one;

import org.testng.annotations.*;

import java.util.EmptyStackException;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/7/16.
 */
public class Tester {
    FixedMultiStack<Integer> fs;
    MultiStack<Integer> s;

    @BeforeMethod
    public void setup() throws Exception {
        fs = new FixedMultiStack<>(3, 4);
        s = new MultiStack<>(3, 4);
    }

    @Test
    public void testFixedMultiStack() throws Exception {
        assertTrue(fs.isEmpty(0));
        assertTrue(fs.isEmpty(1));
        assertTrue(fs.isEmpty(2));
        try { fs.isEmpty(3); fail(); } catch(IndexOutOfBoundsException e) { } catch(Exception e) { fail(); }
        fs.push(2, 0);
        fs.push(2, 1);
        fs.push(2, 2);
        fs.push(1, 3);
        fs.push(1, 4);
        fs.push(1, 5);
        fs.push(1, 6);
        fs.push(0, 7);
        fs.push(0, 8);
        fs.push(0, 9);
        fs.push(0, 10);
        try { fs.push(0, 11); fail(); } catch(IllegalStateException e) { } catch(Exception e) { fail(); }
        fs.push(2, 12);
        assertEquals((int) fs.peek(1), 6);
        assertEquals((int) fs.pop(1), 6);
        assertEquals((int) fs.pop(1), 5);
        assertEquals((int) fs.pop(1), 4);
        assertEquals((int) fs.pop(1), 3);
        assertEquals((int) fs.pop(0), 10);
        assertEquals((int) fs.pop(0), 9);
        assertEquals((int) fs.pop(0), 8);
        assertEquals((int) fs.pop(0), 7);
        assertEquals((int) fs.pop(2), 12);
        assertEquals((int) fs.pop(2), 2);
        assertEquals((int) fs.pop(2), 1);
        assertEquals((int) fs.pop(2), 0);
        try { fs.peek(2); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { fs.pop(1); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
    }

    @Test
    public void testMultiStack() throws Exception {
        assertTrue(s.isEmpty(0));
        assertTrue(s.isEmpty(1));
        assertTrue(s.isEmpty(2));
        try { s.isEmpty(3); fail(); } catch(IndexOutOfBoundsException e) { } catch(Exception e) { fail(); }
        s.push(2, 0);
        s.push(2, 1);
        s.push(2, 2);
        s.push(1, 3);
        s.push(1, 4);
        s.push(1, 5);
        s.push(1, 6);
        s.push(0, 7);
        s.push(0, 8);
        s.push(0, 9);
        s.push(0, 10);
        s.push(0, 11);
        try { s.push(2, 12); fail(); } catch(IllegalStateException e) { } catch(Exception e) { fail(); }
        assertEquals((int) s.peek(0), 11);
        assertEquals((int) s.peek(1), 6);
        assertEquals((int) s.peek(2), 2);
        assertEquals((int) s.pop(0), 11);
        assertEquals((int) s.pop(0), 10);
        assertEquals((int) s.pop(0), 9);
        s.push(2, 13);
        s.push(1, 14);
        assertEquals((int) s.pop(1), 14);
        assertEquals((int) s.pop(1), 6);
        assertEquals((int) s.pop(1), 5);
        assertEquals((int) s.pop(1), 4);
        assertEquals((int) s.pop(1), 3);
        assertEquals((int) s.pop(0), 8);
        assertEquals((int) s.pop(0), 7);
        assertEquals((int) s.pop(2), 13);
        assertEquals((int) s.pop(2), 2);
        assertEquals((int) s.pop(2), 1);
        assertEquals((int) s.pop(2), 0);
        try { s.peek(2); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        try { s.pop(1); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
    }
}