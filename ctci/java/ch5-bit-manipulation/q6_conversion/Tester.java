package q6_conversion;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q6_conversion.Question.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    @Test
    public void testNumberOfBitsToConvert() throws Exception {
        assertEquals(numberOfBitsToConvert(Integer.parseInt("0", 2), Integer.parseInt("0", 2)), 0);
        assertEquals(numberOfBitsToConvert(Integer.parseInt("111", 2), Integer.parseInt("111", 2)), 0);
        assertEquals(numberOfBitsToConvert(Integer.parseInt("0", 2), Integer.parseInt("1", 2)), 1);
        assertEquals(numberOfBitsToConvert(Integer.parseInt("101", 2), Integer.parseInt("010", 2)), 3);
        assertEquals(numberOfBitsToConvert(Integer.parseInt("1100001011", 2), Integer.parseInt("1000111101", 2)), 5);
        assertEquals(numberOfBitsToConvert(-1, 0), 32);
    }

}