package q5_debugger;

/**
 * Created by jjlee on 8/23/16.
 */
public class Question {
    /* check if the given number is a power of two */
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}
