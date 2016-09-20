package q5_sparse_search;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q5_sparse_search.Question.*;

/**
 * Created by jjlee on 9/20/16.
 */
public class Tester {
    static String[] arr0, arr1, arr2;

    @BeforeMethod
    public void setup() throws Exception {
        arr0 = new String[]{"aaa","ab","ccde","ccf","efghi"};
        arr1 = new String[]{"at","","","","ball","","","car","","","dad","",""};
        arr2 = new String[]{"","","","","","bar","","","","","","","foo","","",""};
    }

    @Test
    public void testSparseSearch() throws Exception {
        assertEquals(sparseSearch(arr0, "ccde"), 2);
        assertEquals(sparseSearch(arr0, "ab"), 1);
        assertEquals(sparseSearch(arr0, "efghi"), 4);
        assertEquals(sparseSearch(arr0, "efg"), -1);
        assertEquals(sparseSearch(arr1, "ball"), 4);
        assertEquals(sparseSearch(arr1, "at"), 0);
        assertEquals(sparseSearch(arr1, "car"), 7);
        assertEquals(sparseSearch(arr1, "dad"), 10);
        assertEquals(sparseSearch(arr1, "elephant"), -1);
        assertEquals(sparseSearch(arr2, "bar"), 5);
        assertEquals(sparseSearch(arr2, "foo"), 12);
        assertEquals(sparseSearch(arr2, "baz"), -1);
    }

}