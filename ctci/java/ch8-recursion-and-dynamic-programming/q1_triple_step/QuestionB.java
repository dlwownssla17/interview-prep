package q1_triple_step;

/**
 * Created by jjlee on 8/23/16.
 */
public class QuestionB {
    /* count the number of possible ways the child can run up the stairs (1 step, 2 steps, 3 steps) using bottom-up */
    public static int numWaysTripleStepIterative(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            int sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }
}
