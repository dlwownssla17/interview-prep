package q2_binary_to_string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q2_binary_to_string.Question.*;

/**
 * Created by jjlee on 8/22/16.
 */
public class Tester {
    @Test
    public void testToBinaryString() throws Exception {
        assertEquals(toBinaryString(0.), "0");
        assertEquals(toBinaryString(0.5), "0.1");
        assertEquals(toBinaryString(0.25), "0.01");
        assertEquals(toBinaryString(0.75), "0.11");
        assertEquals(toBinaryString(0.625), "0.101");
        assertEquals(toBinaryString(1.0 / Math.pow(2, 32)), "0.00000000000000000000000000000001");
        assertEquals(toBinaryString(1.0 / 3), "ERROR");
        assertEquals(toBinaryString(0.72), "ERROR");
        assertEquals(toBinaryString(1.), "ERROR");
    }

    @Test
    public void testToBinaryStringInteger() throws Exception {
        assertEquals(toBinaryString(0), "0");
        assertEquals(toBinaryString(1), "1");
        assertEquals(toBinaryString(2), "10");
        assertEquals(toBinaryString(3), "11");
        assertEquals(toBinaryString(5), "101");
        assertEquals(toBinaryString((int) (Math.pow(2, 31) - 1)), "1111111111111111111111111111111");
        assertEquals(toBinaryString(-1), "11111111111111111111111111111111");
        assertEquals(toBinaryString(-2), "11111111111111111111111111111110");
        assertEquals(toBinaryString((int) -Math.pow(2, 31)), "10000000000000000000000000000000");
    }

}