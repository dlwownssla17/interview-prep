package q11_coins;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q11_coins.Question.*;

/**
 * Created by jjlee on 9/6/16.
 */
public class Tester {
    @Test
    public void testMakeChange() throws Exception {
        assertEquals(makeChange(-1), 0);
        assertEquals(makeChange(0), 1);
        assertEquals(makeChange(1), 1);
        assertEquals(makeChange(3), 1);
        assertEquals(makeChange(5), 2);
        assertEquals(makeChange(10), 4);
        assertEquals(makeChange(12), 4);
        assertEquals(makeChange(20), 9);
        assertEquals(makeChange(25), 13);
        assertEquals(makeChange(50), 49);
    }

}