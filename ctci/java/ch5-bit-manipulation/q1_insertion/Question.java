package q1_insertion;

/**
 * Created by jjlee on 8/22/16.
 */
public class Question {
    /* insert m into n from ith bit to jth bit (at least enough bits to fit in m) */
    public static int updateBits(int n, int m, int i, int j) {
        int maskRightOnes = (1 << i) - 1;
        int maskLeftOnes = j < 31 ? ~((1 << j + 1) - 1) : 0;
        int mask = maskRightOnes | maskLeftOnes;
        return (n & mask) | (m << i);
    }
}
