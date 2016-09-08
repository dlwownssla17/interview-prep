package q12_eight_queens;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by jjlee on 9/7/16.
 */
public class Question {
    /* compute all ways to arrange n queens on an nxn chessboard so that none of them share the same row, column, or
       diagonal, by keeping track of the row of the queens at each column so far and checking
       |row_i - row_j| == |col_i - col_j| for same diagonal (used hashset; book solution uses array) (O(N^3)) */
    public static ArrayList<int[]> nQueens(int n) {
        ArrayList<int[]> ways = new ArrayList<>();
        HashSet<Integer> rows = new HashSet<>();
        for (int i = 0; i < n; i++) {
            rows.add(i);
        }
        nQueensHelper(ways, new int[n], 0, rows);
        return ways;
    }

    private static void nQueensHelper(ArrayList<int[]> ways, int[] buf, int currentCol, HashSet<Integer> rows) {
        if (currentCol == buf.length) {
            ways.add(buf.clone());
            return;
        }
        for (int row : new ArrayList<>(rows)) {
            boolean sameDiag = false;
            for (int i = 0; i < currentCol; i++) {
                if (Math.abs(row - buf[i]) == currentCol - i) {
                    sameDiag = true;
                    break;
                }
            }
            if (!sameDiag) {
                buf[currentCol] = row;
                rows.remove(row);
                nQueensHelper(ways, buf, currentCol + 1, rows);
                rows.add(row);
            }
        }
    }
}
