package q9_sorted_matrix_search;

/**
 * Created by jjlee on 9/21/16.
 */
public class QuestionB {
    /* find the element in a sorted matrix by binary search and recursing into three quadrants
       (two quadrants in book solution by finding the first element > x) */
    public static Coordinate sortedMatrixSearchBinary(int[][] matrix, int x) {
        return sortedMatrixSearchBinaryHelper(matrix, x, 0, 0, matrix.length - 1, matrix[0].length - 1);
    }

    private static Coordinate sortedMatrixSearchBinaryHelper(int[][] matrix, int x, int r0, int c0, int r1, int c1) {
        if (r0 > r1 || c0 > c1) return null;
        int rMid = (r0 + r1) / 2;
        int cMid = (c0 + c1) / 2;
        if (matrix[rMid][cMid] == x){
            return new Coordinate(rMid, cMid);
        }
        else if (matrix[rMid][cMid] > x) {
            Coordinate upperLeft = sortedMatrixSearchBinaryHelper(matrix, x, r0, c0, rMid - 1, cMid - 1);
            if (upperLeft != null) return upperLeft;
            Coordinate upperRight = sortedMatrixSearchBinaryHelper(matrix, x, r0, cMid, rMid - 1, c1);
            if (upperRight != null) return upperRight;
            return sortedMatrixSearchBinaryHelper(matrix, x, rMid, c0, r1, cMid - 1);
        } else {
            Coordinate lowerRight = sortedMatrixSearchBinaryHelper(matrix, x, rMid + 1, cMid + 1, r1, c1);
            if (lowerRight != null) return lowerRight;
            Coordinate upperRight = sortedMatrixSearchBinaryHelper(matrix, x, r0, cMid + 1, rMid, c1);
            if (upperRight != null) return upperRight;
            return sortedMatrixSearchBinaryHelper(matrix, x, rMid + 1, c0, r1, cMid);
        }
    }
}
