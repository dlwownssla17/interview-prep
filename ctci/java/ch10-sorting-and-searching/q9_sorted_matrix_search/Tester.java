package q9_sorted_matrix_search;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q9_sorted_matrix_search.QuestionA.*;
import static q9_sorted_matrix_search.QuestionB.*;

/**
 * Created by jjlee on 9/21/16.
 */
public class Tester {
    int[][] matrix;

    @BeforeMethod
    public void setup() throws Exception {
        matrix = new int[][]{{0,10,20,30,40,50,60,70},
                             {5,12,31,32,53,71,75,78},
                             {7,15,33,42,55,74,77,80},
                             {11,17,41,44,56,79,81,83},
                             {22,28,45,46,76,84,85,90}};
    }

    @Test
    public void testSortedMatrixSearch() throws Exception {
        assertEquals(sortedMatrixSearch(matrix, 0), new Coordinate(0,0));
        assertEquals(sortedMatrixSearch(matrix, 1), null);
        assertEquals(sortedMatrixSearch(matrix, 5), new Coordinate(2,0));
        assertEquals(sortedMatrixSearch(matrix, 30), new Coordinate(0,3));
        assertEquals(sortedMatrixSearch(matrix, 12), new Coordinate(1,1));
        assertEquals(sortedMatrixSearch(matrix, 33), new Coordinate(2,2));
        assertEquals(sortedMatrixSearch(matrix, 55), new Coordinate(2,4));
        assertEquals(sortedMatrixSearch(matrix, 71), new Coordinate(1,5));
        assertEquals(sortedMatrixSearch(matrix, 72), null);
        assertEquals(sortedMatrixSearch(matrix, 78), new Coordinate(1,7));
        assertEquals(sortedMatrixSearch(matrix, 90), new Coordinate(4,7));
        assertEquals(sortedMatrixSearch(matrix, 56), new Coordinate(3,4));
        assertEquals(sortedMatrixSearch(matrix, 46), new Coordinate(4,3));
        assertEquals(sortedMatrixSearch(matrix, 47), null);
        assertEquals(sortedMatrixSearch(matrix, 88), null);
        assertEquals(sortedMatrixSearch(matrix, 17), new Coordinate(3,1));
        assertEquals(sortedMatrixSearch(matrix, 77), new Coordinate(2,6));
        assertEquals(sortedMatrixSearch(matrix, 41), new Coordinate(3,2));
        assertEquals(sortedMatrixSearch(matrix, 83), new Coordinate(3,7));
        assertEquals(sortedMatrixSearch(matrix, 74), new Coordinate(2,5));
        assertEquals(sortedMatrixSearch(matrix, 90), new Coordinate(4,7));
    }

}