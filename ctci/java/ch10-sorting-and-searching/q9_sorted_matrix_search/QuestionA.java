package q9_sorted_matrix_search;

/**
 * Created by jjlee on 9/21/16.
 */
public class QuestionA {
    /* find the element in a sorted matrix by narrowing down the column and row indices (O(M + N)) */
    public static Coordinate sortedMatrixSearch(int[][] matrix, int x) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == x) return new Coordinate(row, col);
            else if (matrix[row][col] > x) col--;
            else row++;
        }
        return null;
    }
}
