package q10_paint_fill;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q10_paint_fill.Question.*;

/**
 * Created by jjlee on 9/6/16.
 */
public class Tester {
    static int[][] screen0, screen1, screen2, screen3;

    @BeforeMethod
    public void setup() throws Exception {
        screen0 = new int[][]{ { 0 } };
        screen1 = new int[][]{ { 0, 1, 1, 1, 0, 0 } };
        screen2 = new int[][]{ { 0, 1, 1, 1, 0, 0 },
                               { 0, 1, 0, 1, 1, 2 } };
        screen3 = new int[][]{ { 0, 0, 0, 0, 0, 0, 0 },
                               { 0, 1, 1, 1, 1, 1, 0 },
                               { 0, 1, 2, 2, 2, 1, 0 },
                               { 0, 1, 2, 1, 2, 1, 0 },
                               { 0, 1, 2, 2, 2, 1, 0 },
                               { 0, 1, 1, 1, 1, 1, 0 },
                               { 0, 0, 0, 0, 0, 0, 0 }};
    }

    @Test
    public void testPaintFill() throws Exception {
        printScreen(screen0);
        paintFill(screen0, 0, 1, 1);
        printScreen(screen0);
        paintFill(screen0, 0, 0, 1);
        printScreen(screen0);
        System.out.println();

        printScreen(screen1);
        paintFill(screen1, 0, 0, 1);
        printScreen(screen1);
        paintFill(screen1, 0, 5, 2);
        printScreen(screen1);
        paintFill(screen1, 0, 0, 2);
        printScreen(screen1);
        System.out.println();

        printScreen(screen2);
        paintFill(screen2, 1, 3, 0);
        printScreen(screen2);
        paintFill(screen2, 0, 5, 3);
        printScreen(screen2);
        System.out.println();

        printScreen(screen3);
        paintFill(screen3, 0, 0, 2);
        printScreen(screen3);
        paintFill(screen3, 0, 0, 1);
        printScreen(screen3);
        paintFill(screen3, 0, 0, 2);
        printScreen(screen3);
        paintFill(screen3, 0, 0, 1);
        printScreen(screen3);
        System.out.println();
    }

    private void printScreen(int[][] screen) {
        System.out.println("Printing screen...");
        for (int[] row : screen) {
            for (int color : row) {
                System.out.print(color + " ");
            }
            System.out.println();
        }
    }

}