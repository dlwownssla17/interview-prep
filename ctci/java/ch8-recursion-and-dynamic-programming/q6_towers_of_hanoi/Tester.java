package q6_towers_of_hanoi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q6_towers_of_hanoi.Question.*;

/**
 * Created by jjlee on 8/28/16.
 */
public class Tester {
    Tower<Integer> a0, a1, a2, b0, b1, b2, c0, c1, c2, d0, d1, d2;

    @BeforeMethod
    public void setup() throws Exception {
        a0 = new Tower<>("a0");
        a1 = new Tower<>("a1");
        a2 = new Tower<>("a2");
        b0 = new Tower<>("b0");
        b1 = new Tower<>("b1");
        b2 = new Tower<>("b2");
        c0 = new Tower<>("c0");
        c1 = new Tower<>("c1");
        c2 = new Tower<>("c2");
        d0 = new Tower<>("d0");
        d1 = new Tower<>("d1");
        d2 = new Tower<>("d2");

        pushDecrementedIntegers(a0, 0);
        pushDecrementedIntegers(b0, 1);
        pushDecrementedIntegers(c0, 2);
        pushDecrementedIntegers(d0, 6);
    }

    private void pushDecrementedIntegers(Tower<Integer> tower, int startingNumber) {
        for (int i = startingNumber; i >= 0; i--) {
            tower.push(i);
        }
    }

    @Test
    public void testMoveDisks() throws Exception {
        moveDisks(a0, a1, a2);
        assertEquals((int) a2.pop(), 0);
        assertTrue(a2.isEmpty());
        System.out.println();

        moveDisks(b0, b1, b2);
        assertEquals((int) b2.pop(), 0);
        assertEquals((int) b2.pop(), 1);
        assertTrue(b2.isEmpty());
        System.out.println();

        moveDisks(c0, c1, c2);
        assertEquals((int) c2.pop(), 0);
        assertEquals((int) c2.pop(), 1);
        assertEquals((int) c2.pop(), 2);
        assertTrue(c2.isEmpty());
        System.out.println();

        moveDisks(d0, d1, d2);
        assertEquals((int) d2.pop(), 0);
        assertEquals((int) d2.pop(), 1);
        assertEquals((int) d2.pop(), 2);
        assertEquals((int) d2.pop(), 3);
        assertEquals((int) d2.pop(), 4);
        assertEquals((int) d2.pop(), 5);
        assertEquals((int) d2.pop(), 6);
        assertTrue(d2.isEmpty());
        System.out.println();
    }

}