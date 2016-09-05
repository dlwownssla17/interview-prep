package q5_recursive_multiply;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q5_recursive_multiply.Question.*;

/**
 * Created by jjlee on 8/28/16.
 */
public class Tester {
    @Test
    public void testRecursiveMultiply() throws Exception {
        assertEquals(recursiveMultiply(4, 6), 4 * 6);
        assertEquals(recursiveMultiply(51, 350), 51 * 350);
        assertEquals(recursiveMultiply(3579, 3575), 3579 * 3575);
        assertEquals(recursiveMultiply(700, 0), 700 * 0);
        assertEquals(recursiveMultiply(Integer.MAX_VALUE, 1), Integer.MAX_VALUE * 1);
        assertEquals(recursiveMultiply(0, 0), 0 * 0);
        assertEquals(recursiveMultiply(-21, 35), -21 * 35);
        assertEquals(recursiveMultiply(500, -2000), 500 * -2000);
        assertEquals(recursiveMultiply(-1234, -4321), -1234 * -4321);
        assertEquals(recursiveMultiply(-7777, 7777), -7777 * 7777);
    }

}