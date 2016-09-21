package q7_missing_int;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q7_missing_int.QuestionA.*;

/**
 * Created by jjlee on 9/21/16.
 */
public class Tester {
    @Test
    public void testFindMissingInt() throws Exception {
        assertEquals(findMissingInt("/Users/jjlee/interview-prep/ctci/java/ch10-sorting-and-searching/q7_missing_int/input.txt"), 1234325);
    }

}