package q7_rotate_matrix;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import static q7_rotate_matrix.Question.*;

/**
 * Created by jjlee on 7/12/16.
 */
public class Tester {
    @Test
    public void testRotate() throws Exception {
        int[][] matrixA = countingMatrix(0);
        int[][] rotatedMatrixA = {};
        int[][] matrixB = countingMatrix(1);
        int[][] rotatedMatrixB = {{0}};
        int[][] matrixC = countingMatrix(2);
        int[][] rotatedMatrixC = {{2, 0}, {3, 1}};
        int[][] matrixD = countingMatrix(3);
        int[][] rotatedMatrixD = {{6, 3, 0}, {7, 4, 1}, {8, 5, 2}};
        int[][] matrixE = countingMatrix(6);
        int[][] rotatedMatrixE = {{30, 24, 18, 12, 6, 0}, {31, 25, 19, 13, 7, 1}, {32, 26, 20, 14, 8, 2},
                {33, 27, 21, 15, 9, 3}, {34, 28, 22, 16, 10, 4}, {35, 29, 23, 17, 11, 5}};

        rotate(matrixA);
        assertEquals(matrixA, rotatedMatrixA);
        rotate(matrixB);
        assertEquals(matrixB, rotatedMatrixB);
        rotate(matrixC);
        assertEquals(matrixC, rotatedMatrixC);
        rotate(matrixD);
        assertEquals(matrixD, rotatedMatrixD);
        rotate(matrixE);
        assertEquals(matrixE, rotatedMatrixE);
    }

    /* generate counting matrix */
    private int[][] countingMatrix(int N) {
        int[][] matrix = new int[N][N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }
}