package q5_sort_stack;

import org.testng.annotations.Test;

import java.util.Stack;

import static org.testng.Assert.*;
import static q5_sort_stack.QuestionA.*;
import static q5_sort_stack.QuestionB.*;

/**
 * Created by jjlee on 8/16/16.
 */
public class Tester {
    @Test
    public void testSortWithOneAdditionalStack() throws Exception {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(1);
        s.push(0);
        s.push(2);
        s = sortWithOneAdditionalStack(s);
        assertEquals((int) s.pop(), 0);
        assertEquals((int) s.pop(), 1);
        assertEquals((int) s.pop(), 2);
        assertEquals((int) s.pop(), 3);
        assertEquals((int) s.pop(), 4);
    }

    @Test
    public void testSortWithMergeSort() throws Exception {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(1);
        s.push(0);
        s.push(2);
        sortWithMergeSort(s);
        assertEquals((int) s.pop(), 0);
        assertEquals((int) s.pop(), 1);
        assertEquals((int) s.pop(), 2);
        assertEquals((int) s.pop(), 3);
        assertEquals((int) s.pop(), 4);
    }

}