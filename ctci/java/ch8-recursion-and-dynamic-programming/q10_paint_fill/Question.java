package q10_paint_fill;

/**
 * Created by jjlee on 9/6/16.
 */
public class Question {
    /* paint fill screen recursively */
    public static void paintFill(int[][] screen, int r, int c, int color) {
        if (outOfBounds(screen, r, c)) return;
        paintFillHelper(screen, r, c, color, screen[r][c]);
    }

    private static void paintFillHelper(int[][] screen, int r, int c, int color, int prevColor) {
        if (outOfBounds(screen, r, c) || screen[r][c] != prevColor) return;
        screen[r][c] = color;
        paintFillHelper(screen, r, c - 1, color, prevColor);
        paintFillHelper(screen, r, c + 1, color, prevColor);
        paintFillHelper(screen, r - 1, c, color, prevColor);
        paintFillHelper(screen, r + 1, c, color, prevColor);
    }

    private static boolean outOfBounds(int[][] screen, int r, int c) {
        return r < 0 || r >= screen.length || c < 0 || c >= screen[0].length;
    }
}
