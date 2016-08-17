package q2_check_permutation;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import static q2_check_permutation.QuestionA.*;
import static q2_check_permutation.QuestionB.*;

/**
 * Created by jjlee on 7/10/16.
 */
public class Tester {
    @Test
    public void testCheckPermutation() throws Exception {
        assertFalse(checkPermutation("asdf", "asdfg"));
        assertFalse(checkPermutation("asdf", "asdg"));
        assertTrue(checkPermutation("asdf", "asdf"));
        assertTrue(checkPermutation("asdf", "fads"));
        assertTrue(checkPermutation("asriel dreemurr", "serial murderer"));
    }

    @Test
    public void testCheckPermutationNoAssumption() throws Exception {
        assertFalse(checkPermutationNoAssumption("asdf", "asdfg"));
        assertFalse(checkPermutationNoAssumption("asdf", "asdg"));
        assertTrue(checkPermutationNoAssumption("asdf", "asdf"));
        assertTrue(checkPermutationNoAssumption("asdf", "fads"));
        assertTrue(checkPermutationNoAssumption("asriel dreemurr", "serial murderer"));
    }

    @Test
    public void testCheckPermutationWithSort() throws Exception {
        assertFalse(checkPermutationWithSort("asdf", "asdfg"));
        assertFalse(checkPermutationWithSort("asdf", "asdg"));
        assertTrue(checkPermutationWithSort("asdf", "asdf"));
        assertTrue(checkPermutationWithSort("asdf", "fads"));
        assertTrue(checkPermutationWithSort("asriel dreemurr", "serial murderer"));
    }
}
