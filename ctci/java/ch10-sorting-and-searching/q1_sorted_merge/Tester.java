package q1_sorted_merge;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q1_sorted_merge.Question.*;

/**
 * Created by jjlee on 9/12/16.
 */
public class Tester {
    static int[] a0, b0, test0, a1, b1, test1, a2, b2, test2, a3, b3, test3;

    @BeforeMethod
    public void setup() throws Exception {
        a0 = new int[]{ 0, 5, 10, 15, 0, 0, 0, 0 };
        b0 = new int[]{ 20, 25, 30, 35 };
        test0 = new int[]{ 0, 5, 10, 15, 20, 25, 30, 35 };
        a1 = new int[]{ 20, 25, 30, 35, 0, 0, 0, 0 };
        b1 = new int[]{ 0, 5, 10, 15 };
        test1 = test0;
        a2 = new int[]{ 0, 5, 10, 15, 0, 0, 0, 0 };
        b2 = new int[]{ 3, 4, 12, 0, 0 };
        test2 = new int[]{ 0, 3, 4, 5, 10, 12, 15, 0 };
        a3 = new int[]{ 0, 5, 10, 15, 0, 0, 0, 0, 0, 0, 0 };
        b3 = new int[]{ 3, 4, 12, 16, 17, 0 };
        test3 = new int[]{ 0, 3, 4, 5, 10, 12, 15, 16, 17, 0, 0 };
    }

    @Test
    public void testMerge() throws Exception {
        merge(a0, b0, 4, 4);
        assertEquals(a0, test0);
        merge(a1, b1, 4, 4);
        assertEquals(a1, test1);
        merge(a2, b2, 4, 3);
        assertEquals(a2, test2);
        merge(a3, b3, 4, 5);
        assertEquals(a3, test3);
    }
}