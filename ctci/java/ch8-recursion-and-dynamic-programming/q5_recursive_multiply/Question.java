package q5_recursive_multiply;

import java.util.HashMap;

/**
 * Created by jjlee on 8/28/16.
 */
public class Question {
    /* multiply using recursion and dynamic programming */
    public static int recursiveMultiply(int a, int b) {
        boolean isNegative = false;
        if (a < 0) {
            a = -a;
            isNegative = true;
        }
        if (b < 0) {
            b = -b;
            isNegative = !isNegative;
        }
        int smaller = Math.min(a, b);
        int bigger = Math.max(a, b);
        int prod = recursiveMultiplyNonNegative(smaller, bigger);
        return isNegative ? -prod : prod;
    }

    private static int recursiveMultiplyNonNegative(int smaller, int bigger) {
        if (smaller == 0) return 0;
        if (smaller == 1) return bigger;
        int halfProd = recursiveMultiplyNonNegative(smaller >> 1, bigger);
        return halfProd + halfProd + (smaller % 2 == 0 ? 0 : bigger);
    }
}
