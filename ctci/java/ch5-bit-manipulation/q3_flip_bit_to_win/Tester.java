package q3_flip_bit_to_win;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q3_flip_bit_to_win.Question.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    @Test
    public void testLongestSequence() throws Exception {
        assertEquals(longestSequence(Integer.parseUnsignedInt("00000000000000000000000000000000", 2)), 1);
        assertEquals(longestSequence(Integer.parseUnsignedInt("00000000000000000000000000000001", 2)), 2);
        assertEquals(longestSequence(Integer.parseUnsignedInt("10000000000000000000000000000000", 2)), 2);
        assertEquals(longestSequence(Integer.parseUnsignedInt("00000001000000000000000000000000", 2)), 2);
        assertEquals(longestSequence(Integer.parseUnsignedInt("00000001000000010000000100000001", 2)), 2);
        assertEquals(longestSequence(Integer.parseUnsignedInt("11111111111111111111111111111111", 2)), 32);
        assertEquals(longestSequence(Integer.parseUnsignedInt("00000000001111111000000000000111", 2)), 8);
        assertEquals(longestSequence(Integer.parseUnsignedInt("11111111100000000001111000000000", 2)), 10);
        assertEquals(longestSequence(Integer.parseUnsignedInt("01111111111111111111111111111111", 2)), 32);
        assertEquals(longestSequence(Integer.parseUnsignedInt("11111111111111101111111111111111", 2)), 32);
        assertEquals(longestSequence(Integer.parseUnsignedInt("11111111111111101111111110111111", 2)), 25);
        assertEquals(longestSequence(Integer.parseUnsignedInt("11011111001111110000001110100011", 2)), 8);
        assertEquals(longestSequence(Integer.parseUnsignedInt("11111000011101110111000111110000", 2)), 7);
        assertEquals(longestSequence(Integer.parseUnsignedInt("11111000011100000111000111100001", 2)), 6);
    }

    @Test
    public void testLongestSequence2() throws Exception {
        assertEquals(longestSequence2(Integer.parseUnsignedInt("00000000000000000000000000000000", 2)), 1);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("00000000000000000000000000000001", 2)), 2);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("10000000000000000000000000000000", 2)), 2);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("00000001000000000000000000000000", 2)), 2);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("00000001000000010000000100000001", 2)), 2);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("11111111111111111111111111111111", 2)), 32);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("00000000001111111000000000000111", 2)), 8);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("11111111100000000001111000000000", 2)), 10);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("01111111111111111111111111111111", 2)), 32);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("11111111111111101111111111111111", 2)), 32);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("11111111111111101111111110111111", 2)), 25);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("11011111001111110000001110100011", 2)), 8);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("11111000011101110111000111110000", 2)), 7);
        assertEquals(longestSequence2(Integer.parseUnsignedInt("11111000011100000111000111100001", 2)), 6);
    }

}