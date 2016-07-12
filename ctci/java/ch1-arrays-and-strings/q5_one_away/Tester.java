package q5_one_away;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q5_one_away.Question.*;

/**
 * Created by jjlee on 7/11/16.
 */
public class Tester {
    @Test
    public void testOneEditAway() throws Exception {
        assertTrue(oneEditAway("pale", "ple"));
        assertTrue(oneEditAway("pales", "pale"));
        assertTrue(oneEditAway("pale", "bale"));
        assertTrue(oneEditAway("pale", "pale"));
        assertTrue(oneEditAway("pale", "pane"));
        assertTrue(oneEditAway("pale", "paler"));
        assertTrue(oneEditAway("pale", "phale"));
        assertTrue(oneEditAway("", ""));
        assertFalse(oneEditAway("pale", "bake"));
        assertFalse(oneEditAway("pale", "palest"));
        assertFalse(oneEditAway("pale", "a"));
    }

}