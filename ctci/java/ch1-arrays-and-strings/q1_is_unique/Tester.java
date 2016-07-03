package q1_is_unique;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q1_is_unique.QuestionA.*;
import static q1_is_unique.QuestionB.*;

/**
 * Created by jjlee on 7/2/16.
 */
public class Tester {
    @Test
    public void testIsUnique() throws Exception {
        assertTrue(isUnique("abcd"));
        assertFalse(isUnique("abcb"));
        assertTrue(isUnique("123456asdfg7890."));
        assertFalse(isUnique(".123456asdfg7890."));
    }

    @Test
    public void testIsUniqueNoAssumption() throws Exception {
        assertTrue(isUniqueNoAssumption("abcd"));
        assertFalse(isUniqueNoAssumption("abcb"));
        assertTrue(isUniqueNoAssumption("123456asdfg7890."));
        assertFalse(isUniqueNoAssumption(".123456asdfg7890."));
    }

    @Test
    public void testIsUniqueNoAdditionalDataStructure() throws Exception {
        assertTrue(isUniqueNoAdditionalDataStructure("abcd"));
        assertFalse(isUniqueNoAdditionalDataStructure("abcb"));
        assertTrue(isUniqueNoAdditionalDataStructure("something"));
        assertFalse(isUniqueNoAdditionalDataStructure("interview"));
    }
}