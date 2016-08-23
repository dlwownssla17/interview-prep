package q1_triple_step;

/**
 * Created by jjlee on 8/23/16.
 */
public class QuestionA {
    /* count the number of possible ways the child can run up the stairs (1 step, 2 steps, 3 steps) using memoization */
    public static int numWaysTripleStep(int n) {
        return numWaysTripleStep(n, new int[n + 1]);
    }

    private static int numWaysTripleStep(int n, int[] memo) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo[n] == 0)
            memo[n] = numWaysTripleStep(n - 1, memo) + numWaysTripleStep(n - 2, memo) + numWaysTripleStep(n - 3, memo);
        return memo[n];
    }
}
