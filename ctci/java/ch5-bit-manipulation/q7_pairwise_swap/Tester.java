package q7_pairwise_swap;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q7_pairwise_swap.Question.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    @Test
    public void testPairwiseSwap() throws Exception {
        assertEquals(pairwiseSwap(Integer.parseInt("0", 2)), Integer.parseInt("0", 2));
        assertEquals(pairwiseSwap(Integer.parseInt("01", 2)), Integer.parseInt("10", 2));
        assertEquals(pairwiseSwap(Integer.parseInt("10", 2)), Integer.parseInt("01", 2));
        assertEquals(pairwiseSwap(Integer.parseInt("1101", 2)), Integer.parseInt("1110", 2));
        assertEquals(pairwiseSwap(Integer.parseInt("10011100", 2)), Integer.parseInt("01101100", 2));
        assertEquals(pairwiseSwap(Integer.parseInt("1010011110", 2)), Integer.parseInt("0101101101", 2));
    }

}