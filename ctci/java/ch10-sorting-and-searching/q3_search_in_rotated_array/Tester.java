package q3_search_in_rotated_array;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q3_search_in_rotated_array.Question.*;

/**
 * Created by jjlee on 9/12/16.
 */
public class Tester {
    static int[] arr0, arr1, arr2;

    @BeforeMethod
    public void setup() throws Exception {
        arr0 = new int[]{ 15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14 };
        arr1 = new int[]{ 5, 7, 10, 14, 15, 16, 19, 20, 25, 1, 3, 4 };
        arr2 = new int[]{ 5, 5, 5, 5, 5, 5, 7, 3, 5, 5, 5, 5 };
    }

    @Test
    public void testSearchInRotatedArray() throws Exception {
        assertEquals(searchInRotatedArray(arr0, 0), -1);
        assertEquals(searchInRotatedArray(arr0, 1), 5);
        assertEquals(searchInRotatedArray(arr0, 3), 6);
        assertEquals(searchInRotatedArray(arr0, 4), 7);
        assertEquals(searchInRotatedArray(arr0, 5), 8);
        assertEquals(searchInRotatedArray(arr0, 7), 9);
        assertEquals(searchInRotatedArray(arr0, 10), 10);
        assertEquals(searchInRotatedArray(arr0, 14), 11);
        assertEquals(searchInRotatedArray(arr0, 15), 0);
        assertEquals(searchInRotatedArray(arr0, 16), 1);
        assertEquals(searchInRotatedArray(arr0, 19), 2);
        assertEquals(searchInRotatedArray(arr0, 20), 3);
        assertEquals(searchInRotatedArray(arr0, 25), 4);
        assertEquals(searchInRotatedArray(arr0, 30), -1);
        assertEquals(searchInRotatedArray(arr1, 0), -1);
        assertEquals(searchInRotatedArray(arr1, 1), 9);
        assertEquals(searchInRotatedArray(arr1, 3), 10);
        assertEquals(searchInRotatedArray(arr1, 4), 11);
        assertEquals(searchInRotatedArray(arr1, 5), 0);
        assertEquals(searchInRotatedArray(arr1, 7), 1);
        assertEquals(searchInRotatedArray(arr1, 10), 2);
        assertEquals(searchInRotatedArray(arr1, 14), 3);
        assertEquals(searchInRotatedArray(arr1, 15), 4);
        assertEquals(searchInRotatedArray(arr1, 16), 5);
        assertEquals(searchInRotatedArray(arr1, 19), 6);
        assertEquals(searchInRotatedArray(arr1, 20), 7);
        assertEquals(searchInRotatedArray(arr1, 25), 8);
        assertEquals(searchInRotatedArray(arr1, 30), -1);
        assertEquals(searchInRotatedArray(arr2, 0), -1);
        assertEquals(searchInRotatedArray(arr2, 3), 7);
        assertEquals(searchInRotatedArray(arr2, 5), 5);
        assertEquals(searchInRotatedArray(arr2, 7), 6);
        assertEquals(searchInRotatedArray(arr2, 9), -1);
    }
}