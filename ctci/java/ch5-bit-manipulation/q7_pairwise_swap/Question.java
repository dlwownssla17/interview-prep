package q7_pairwise_swap;

/**
 * Created by jjlee on 8/23/16.
 */
public class Question {
    /* swap odd and even bits in given integer */
    public static int pairwiseSwap(int n) {
        int evenBitsAfterSwap = (n << 1) & 0xAAAA;
        int oddBitsAfterSwap = (n >>> 1) & 0x5555;
        return evenBitsAfterSwap | oddBitsAfterSwap;
    }
}
