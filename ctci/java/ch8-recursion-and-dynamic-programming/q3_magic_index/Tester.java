package q3_magic_index;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q3_magic_index.Question.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    static int[] a, b, c, aDup, bDup, cDup, dDup, eDup;

    @BeforeMethod
    public void setup() throws Exception {
        a = new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        b = new int[]{ -1, 0, 1, 2, 3, 5, 7, 8, 9, 10 };
        c = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        aDup = new int[]{ -1, -1, 2, 2, 4, 4, 4, 4, 4, 4 };
        bDup = new int[]{ -1, 0, 1, 3, 3, 4, 4, 4, 4, 4 };
        cDup = new int[]{ -1, 0, 1, 2, 3, 5, 5, 6, 6, 6 };
        dDup = new int[]{ -1, -1, -1, -1, -1, 10, 10, 10, 10, 10 };
    }

    @Test
    public void testGetMagicIndex() throws Exception {
        assertEquals(getMagicIndex(a), 4);
        assertEquals(getMagicIndex(b), 5);
        assertEquals(getMagicIndex(c), -1);
    }

    @Test
    public void testGetMagicIndexRecursive() throws Exception {
        assertEquals(getMagicIndexRecursive(a), 4);
        assertEquals(getMagicIndexRecursive(b), 5);
        assertEquals(getMagicIndexRecursive(c), -1);
    }

    @Test
    public void testGetMagicIndexDup() throws Exception {
        assertEquals(getMagicIndexDup(aDup), 4);
        assertEquals(getMagicIndexDup(bDup), 3);
        assertEquals(getMagicIndexDup(cDup), 5);
        assertEquals(getMagicIndexDup(dDup), -1);
    }

}