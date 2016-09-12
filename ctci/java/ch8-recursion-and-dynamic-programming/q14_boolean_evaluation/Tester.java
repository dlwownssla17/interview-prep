package q14_boolean_evaluation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q14_boolean_evaluation.Question.*;

/**
 * Created by jjlee on 9/12/16.
 */
public class Tester {
    @Test
    public void testCountEval() throws Exception {
        assertEquals(countEval("", true), 0);
        assertEquals(countEval("0", true), 0);
        assertEquals(countEval("1", true), 1);
        assertEquals(countEval("1^1", false), 1);
        assertEquals(countEval("1^0|0|1", false), 2);
        assertEquals(countEval("0&0&0&1^1|0", true), 10);
        assertEquals(countEval("0&0&0&1^1|0", false), 32);
    }

}