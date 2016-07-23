package q8_zero_matrix;

/**
 * Created by jjlee on 7/12/16.
 */
public class Question {
    /* in place using first row and first column to mark presence of zeros */
    public static void setZeros(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;

        boolean firstRow = firstRowHasZeros(matrix);
        boolean firstColumn = firstColumnHasZeros(matrix);

        markZeros(matrix);

        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                setColumnZeros(matrix, j);
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                setRowZeros(matrix, i);
            }
        }

        if (firstRow) setRowZeros(matrix, 0);
        if (firstColumn) setColumnZeros(matrix, 0);
    }

    /* check if first row has zeros */
    public static boolean firstRowHasZeros(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) return true;
        }
        return false;
    }

    /* check if first column has zeros */
    public static boolean firstColumnHasZeros(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) return true;
        }
        return false;
    }

    /* mark zeros in first row and first column */
    public static void markZeros(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
    }

    /* set given row to zeros */
    public static void setRowZeros(int[][] matrix, int row) {
        for (int j = 0; j < matrix[row].length; j++) {
            matrix[row][j] = 0;
        }
    }

    /* set given column to zeros */
    public static void setColumnZeros(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
