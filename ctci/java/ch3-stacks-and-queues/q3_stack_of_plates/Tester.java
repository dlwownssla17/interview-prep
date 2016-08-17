package q3_stack_of_plates;

import org.testng.annotations.*;

import java.util.EmptyStackException;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/16/16.
 */
public class Tester {
    SetOfStacks<Integer> s;

    @BeforeMethod
    public void setup() throws Exception {
        s = new SetOfStacks<>(4);
    }

    @Test
    public void testSetOfStacks() throws Exception {
        try { new SetOfStacks<>(0); fail(); } catch(IllegalArgumentException e) { } catch(Exception e) { fail(); }
        try { s.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        s.push(16);
        assertEquals((int) s.pop(), 16);
        assertEquals((int) s.pop(), 15);
        assertEquals((int) s.pop(), 14);
        assertEquals((int) s.pop(), 13);
        try { s.popAt(4); fail(); } catch(IndexOutOfBoundsException e) { } catch(Exception e) { fail(); }
        assertEquals((int) s.popAt(0), 3);
        assertEquals((int) s.popAt(0), 4);
        assertEquals((int) s.popAt(1), 9);
        assertEquals((int) s.popAt(2), 12);
        assertEquals((int) s.popAt(2), 11);
        assertEquals((int) s.popAt(0), 5);
        assertEquals((int) s.popAt(0), 6);
        assertEquals((int) s.pop(), 10);
        assertEquals((int) s.popAt(0), 7);
        assertEquals((int) s.popAt(0), 8);
        assertEquals((int) s.pop(), 2);
        assertEquals((int) s.pop(), 1);
        assertEquals((int) s.pop(), 0);
        try { s.pop(); fail(); } catch(EmptyStackException e) { } catch(Exception e) { fail(); }
    }
}