package q1_insertion;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q1_insertion.Question.*;

/**
 * Created by jjlee on 8/22/16.
 */
public class Tester {
    @Test
    public void testUpdateBits() throws Exception {
        assertEquals(updateBits(Integer.parseInt("10000000000", 2), Integer.parseInt("10011", 2), 2, 6),
                Integer.parseInt("10001001100", 2));
        assertEquals(updateBits(Integer.parseInt("00000000000", 2), Integer.parseInt("11111", 2), 3, 9),
                Integer.parseInt("00011111000", 2));
        assertEquals(updateBits(Integer.parseInt("111111111111", 2), Integer.parseInt("111110", 2), 1, 8),
                Integer.parseInt("111001111101", 2));
        assertEquals(updateBits(Integer.parseInt("11111111", 2), Integer.parseInt("10101010101010101", 2), 0, 30),
                Integer.parseInt("10101010101010101", 2));
        assertEquals(updateBits(Integer.parseInt("11111111", 2), Integer.parseInt("10101010101010101", 2), 0, 31),
                Integer.parseInt("10101010101010101", 2));
        assertEquals(updateBits(Integer.parseInt("11111111", 2), Integer.parseInt("0", 2), 5, 5),
                Integer.parseInt("11011111", 2));
        assertEquals(updateBits(Integer.parseInt("11111111", 2), Integer.parseInt("1", 2), 3, 3),
                Integer.parseInt("11111111", 2));
    }

}