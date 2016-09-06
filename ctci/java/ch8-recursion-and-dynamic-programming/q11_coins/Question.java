package q11_coins;

/**
 * Created by jjlee on 9/6/16.
 */
public class Question {
    /* compute number of ways of representing n cents using memoization */
    public static int makeChange(int n) {
        if (n < 0) return 0;
        int[] changes = { 25, 10, 5, 1 };
        return makeChange(n, changes, 0, new int[n + 1][changes.length]);
    }

    private static int makeChange(int n, int[] changes, int index, int[][] memo){
        if (index >= changes.length - 1) return 1;
        if (memo[n][index] == 0) {
            int sum = 0;
            for (int i = 0; i <= n / changes[index]; i++) {
                sum += makeChange(n - i * changes[index], changes, index + 1, memo);
            }
            memo[n][index] = sum;
        }
        return memo[n][index];
    }
}
