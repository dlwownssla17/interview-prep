package q1_triple_step;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q1_triple_step.QuestionA.*;
import static q1_triple_step.QuestionB.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    @Test
    public void testNumWaysTripleStep() throws Exception {
        assertEquals(numWaysTripleStep(0), 1);
        assertEquals(numWaysTripleStep(1), 1);
        assertEquals(numWaysTripleStep(2), 2);
        assertEquals(numWaysTripleStep(3), 4);
        assertEquals(numWaysTripleStep(7), 44);
        assertEquals(numWaysTripleStep(10), 274);
    }

    @Test
    public void testNumWaysTripleStepIterative() throws Exception {
        assertEquals(numWaysTripleStepIterative(0), 1);
        assertEquals(numWaysTripleStepIterative(1), 1);
        assertEquals(numWaysTripleStepIterative(2), 2);
        assertEquals(numWaysTripleStepIterative(3), 4);
        assertEquals(numWaysTripleStepIterative(7), 44);
        assertEquals(numWaysTripleStepIterative(10), 274);
    }

}