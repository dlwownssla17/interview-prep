package q8_zero_matrix;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import static q8_zero_matrix.Question.*;

/**
 * Created by jjlee on 7/12/16.
 */
public class Tester {
    @Test
    public void testSetZeros() throws Exception {
        int[][] matrixA = {{1}};
        int[][] zeroedMatrixA = {{1}};
        int[][] matrixB = {{0}};
        int[][] zeroedMatrixB = {{0}};
        int[][] matrixC = {{0, 1}};
        int[][] zeroedMatrixC = {{0, 0}};
        int[][] matrixD = {{1, 1, 1}, {1, 1, 0}};
        int[][] zeroedMatrixD = {{1, 1, 0}, {0, 0, 0}};
        int[][] matrixE = {{1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}};
        int[][] zeroedMatrixE = {{0, 0, 0, 0, 0}, {1, 0, 1, 0, 1}, {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {0, 0, 0, 0, 0}};
        int[][] matrixJoel = {{0,0,1,1,1}, {1,1,2,4,100}, {0,2, 3, 4, 1}, {4,3,4,3,0}};
        int[][] zeroedMatrixJoel = {{0,0,0,0,0},{0,0,2,4,0},{0,0,0,0,0},{0,0,0,0,0}};

        setZeros(matrixA);
        assertEquals(matrixA, zeroedMatrixA);
        setZeros(matrixB);
        assertEquals(matrixB, zeroedMatrixB);
        setZeros(matrixC);
        assertEquals(matrixC, zeroedMatrixC);
        setZeros(matrixD);
        assertEquals(matrixD, zeroedMatrixD);
        setZeros(matrixE);
        assertEquals(matrixE, zeroedMatrixE);
        setZeros(matrixJoel);
        assertEquals(matrixJoel, zeroedMatrixJoel);
    }
}