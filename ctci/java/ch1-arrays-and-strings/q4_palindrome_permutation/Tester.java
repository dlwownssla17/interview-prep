package q4_palindrome_permutation;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import static q4_palindrome_permutation.Question.*;

/**
 * Created by jjlee on 7/10/16.
 */
public class Tester {
    @Test
    public void testIsPermutationOfPalindrome() throws Exception {
        assertTrue(isPermutationOfPalindrome("Tact Coa"));
        assertTrue(isPermutationOfPalindrome("abba"));
        assertTrue(isPermutationOfPalindrome("   "));
        assertTrue(isPermutationOfPalindrome("RaceCar!"));
        assertFalse(isPermutationOfPalindrome("Tact Coat"));
    }
}