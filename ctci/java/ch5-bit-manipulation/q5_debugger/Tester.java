package q5_debugger;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q5_debugger.Question.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    @Test
    public void testIsPowerOfTwo() throws Exception {
        assertTrue(isPowerOfTwo(1));
        assertTrue(isPowerOfTwo(2));
        assertTrue(isPowerOfTwo(4));
        assertTrue(isPowerOfTwo(8));
        assertTrue(isPowerOfTwo(1024));
        assertFalse(isPowerOfTwo(3));
        assertFalse(isPowerOfTwo(10));
        assertFalse(isPowerOfTwo(1000));
    }

}