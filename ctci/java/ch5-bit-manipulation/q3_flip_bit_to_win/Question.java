package q3_flip_bit_to_win;

/**
 * Created by jjlee on 8/22/16.
 */
public class Question {
    private static int SEQUENCE_LENGTH = 32;

    public static int longestSequence(int n) {
        if (n == -1) return SEQUENCE_LENGTH;
        int ithBitMask = 1;
        int max = 1;
        boolean previousOne = false;
        boolean bridgeSequences = false;
        int thisOneSequence = 0;
        int lastOneSequence = 0;
        for (int i = 0; i < SEQUENCE_LENGTH; i++) {
            boolean ithBit = (n & ithBitMask) != 0;
            if (ithBit) {
                previousOne = true;
                thisOneSequence++;
            } else {
                if (previousOne) {
                    max = Math.max(max, thisOneSequence + 1 + (bridgeSequences ? lastOneSequence : 0));
                    lastOneSequence = thisOneSequence;
                    thisOneSequence = 0;
                    bridgeSequences = i < SEQUENCE_LENGTH - 1 && (n & (ithBitMask << 1)) != 0;
                    previousOne = false;
                }
            }
            ithBitMask <<= 1;
        }
        return previousOne ? Math.max(max, thisOneSequence + 1 + (bridgeSequences ? lastOneSequence : 0)) : max;
    }

    public static int longestSequence2(int n) {
        int searchingFor = 0;
        int[] sequences = { 0, 0, 0 };
        int max = 1;
        for (int i = 0; i < SEQUENCE_LENGTH; i++) {
            int thisBit = n & 1;
            if (thisBit != searchingFor) {
                if (searchingFor == 1) max = Math.max(max, getMaxSequence(sequences));
                searchingFor = thisBit;
                shift(sequences);
            }
            sequences[0]++;
            n >>>= 1;
        }
        if (searchingFor == 0) shift(sequences);
        return Math.max(max, getMaxSequence(sequences));
    }

    private static int getMaxSequence(int[] sequences) {
        if (sequences[1] == 1) return sequences[0] + 1 + sequences[2];
        else if (sequences[1] == 0) return Math.max(sequences[0], sequences[2]);
        else return Math.max(sequences[0], sequences[2]) + 1;
    }

    private static void shift(int[] sequences) {
        sequences[2] = sequences[1];
        sequences[1] = sequences[0];
        sequences[0] = 0;
    }
}
