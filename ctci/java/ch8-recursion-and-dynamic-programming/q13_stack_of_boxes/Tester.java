package q13_stack_of_boxes;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q13_stack_of_boxes.QuestionA.*;
import static q13_stack_of_boxes.QuestionB.*;

/**
 * Created by jjlee on 9/11/16.
 */
public class Tester {
    static Box[] boxesA, boxesB;

    @BeforeMethod
    public void setup() throws Exception {
        Box a0 = new Box(4, 3, 4);
        Box a1 = new Box(7, 10, 5);
        Box a2 = new Box(3, 1, 2);
        boxesA = new Box[]{ a0, a1, a2 };
        Box b0 = new Box(4, 3, 6);
        Box b1 = new Box(2, 4, 5);
        Box b2 = new Box(5, 7, 8);
        Box b3 = new Box(6, 4, 7);
        Box b4 = new Box(1, 8, 2);
        Box b5 = new Box(7, 5, 8);
        Box b6 = new Box(1, 2, 1);
        Box b7 = new Box(2, 4, 5);
        boxesB = new Box[]{ b0, b1, b2, b3, b4, b5, b6, b7 };
    }

    @Test
    public void testStackMaxHeight() throws Exception {
        assertEquals(stackMaxHeight(boxesA), 14);
        assertEquals(stackMaxHeight(boxesB), 14);
    }

    @Test
    public void testStackMaxHeightIncludeExclude() throws Exception {
        assertEquals(stackMaxHeightIncludeExclude(boxesA), 14);
        assertEquals(stackMaxHeightIncludeExclude(boxesB), 14);
    }

}