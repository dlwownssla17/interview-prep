package q3_flip_bit_to_win;

/**
 * Created by jjlee on 8/22/16.
 */
public class Question {

    public static int longestSequence(int n) {
        int ithBitMask = 1;
        int max = 1;
        boolean previousOne = false;
        boolean bridgeSequences = false;
        int thisOneSequence = 0;
        int lastOneSequence = 0;
        for (int i = 0; i < 32; i++) {
            boolean ithBit = (n & ithBitMask) != 0;
            if (ithBit) {
                previousOne = true;
                thisOneSequence++;
            } else {
                if (previousOne) {
                    max = Math.max(max, thisOneSequence + 1 + (bridgeSequences ? lastOneSequence : 0));
                    lastOneSequence = thisOneSequence;
                    thisOneSequence = 0;
                    bridgeSequences = i < 31 && (n & (ithBitMask << 1)) != 0;
                    previousOne = false;
                }
            }
            ithBitMask <<= 1;
        }
        if (previousOne) {
            max = Math.max(max, thisOneSequence == 32 ? thisOneSequence :
                    thisOneSequence + 1 + (bridgeSequences ? lastOneSequence : 0));
        }
        return max;
    }
}
