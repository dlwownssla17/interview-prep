package q4_next_number;

import java.util.NoSuchElementException;

/**
 * Created by jjlee on 8/23/16.
 */
public class QuestionB {
    private static int SEQUENCE_LENGTH = 32;

    /* given a positive integer, compute the next smallest number with same number of 1s using an arithmetic approach */
    public static int nextSmallestArithmetic(int n) {
        int[] c = getTrailingOnesAndFollowingZeros(n);
        return n - (1 << c[1]) - (1 << (c[0] - 1)) + 1;
    }

    private static int[] getTrailingOnesAndFollowingZeros(int n) {
        int[] c = new int[2];
        while ((n & 1) == 1) {
            c[1]++;
            n >>>= 1;
        }
        if (n == 0) throw new NoSuchElementException();
        while ((n & 1) == 0 && n != 0) {
            c[0]++;
            n >>>= 1;
        }
        return c;
    }

    /* given a positive integer, compute the next largest number with same number of 1s using an arithmetic approach */
    public static int nextLargestArithmetic(int n) {
        int[] c = getTrailingZerosAndFollowingOnes(n);
        return n + (1 << c[0]) + (1 << (c[1] - 1)) - 1;
    }

    private static int[] getTrailingZerosAndFollowingOnes(int n) {
        int[] c = new int[2];
        while ((n & 1) == 0 && n != 0) {
            c[0]++;
            n >>>= 1;
        }
        while ((n & 1) == 1) {
            c[1]++;
            n >>>= 1;
        }
        if (c[0] + c[1] == SEQUENCE_LENGTH - 1 || c[0] + c[1] == 0) throw new NoSuchElementException();
        return c;
    }
}
