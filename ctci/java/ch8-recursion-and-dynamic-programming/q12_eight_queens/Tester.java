package q12_eight_queens;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;
import static q12_eight_queens.Question.*;

/**
 * Created by jjlee on 9/7/16.
 */
public class Tester {
    @Test
    public void testNQueens() throws Exception {
        System.out.println("---One Queen---");
        ArrayList<int[]> oneQueen = nQueens(1);
        printWays(oneQueen);
        System.out.println("---Two Queens---");
        ArrayList<int[]> twoQueens = nQueens(2);
        printWays(twoQueens);
        System.out.println("---Three Queens---");
        ArrayList<int[]> threeQueens = nQueens(3);
        printWays(threeQueens);
        System.out.println("---Four Queens---");
        ArrayList<int[]> fourQueens = nQueens(4);
        printWays(fourQueens);
        System.out.println("---Eight Queens---");
        ArrayList<int[]> eightQueens = nQueens(8);
        printWays(eightQueens);
    }

    private void printWays(ArrayList<int[]> ways) {
        System.out.println("Number of ways: " + ways.size());
        for (int[] way : ways) {
            printQueens(way);
            System.out.println("---");
        }
    }

    private void printQueens(int[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println("Row: " + i + ", Col: " + board[i]);
        }
    }

}