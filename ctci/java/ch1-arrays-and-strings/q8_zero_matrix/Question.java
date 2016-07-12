package q8_zero_matrix;

/**
 * Created by jjlee on 7/12/16.
 */
public class Question {
    /* in place using first row and first column to mark presence of zeros */
    public static void setZeros(int[][] matrix) {
        boolean firstRowZeros = markZeros(matrix);
        if (matrix.length > 0)
            setColumnZeros(matrix);
        setRowZeros(matrix, firstRowZeros);
    }

    /* mark presence of zeros */
    private static boolean markZeros(int[][] matrix) {
        boolean firstRowZeros = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i != 0)
                        matrix[i][0] = 0;
                    else
                        firstRowZeros = true;
                    matrix[0][j] = 0;
                }
            }
        }
        return firstRowZeros;
    }

    /* set marked columns as zeros */
    private static void setColumnZeros(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /* set marked rows as zeros */
    private static void setRowZeros(int[][] matrix, boolean firstRowZeros) {
        for (int i = 0; i < matrix.length; i++) {
            if ((i == 0 && firstRowZeros) || matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
