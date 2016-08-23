package q4_next_number;

import java.util.NoSuchElementException;

/**
 * Created by jjlee on 8/23/16.
 */
public class QuestionA {
    private static int SEQUENCE_LENGTH = 32;

    /* given a positive integer, compute the next smallest number using a bit manipulation approach */
    public static int nextSmallest(int n) {
        int oneCount = 0;
        int shifted = n;
        for (int i = 0; i < SEQUENCE_LENGTH; i++) {
            int thisBit = shifted & 1;
            if (thisBit == 1) {
                oneCount++;
                if (oneCount <= i) return nextSmallestHelper(n, i, oneCount);
            }
            shifted >>>= 1;
        }
        throw new NoSuchElementException();
    }

    private static int nextSmallestHelper(int n, int index, int oneCount) {
        int bitMask = -1 << (index + 1);
        int oneBits = (-1 >>> (SEQUENCE_LENGTH - oneCount)) << (index - oneCount);
        return (n & bitMask) | oneBits;
    }

    /* given a positive integer, compute the next largest number using a bit manipulation approach */
    public static int nextLargest(int n) {
        int oneCount = 0;
        int shifted = n;
        boolean seenOne = false;
        for (int i = 0; i < SEQUENCE_LENGTH - 1; i++) {
            int thisBit = shifted & 1;
            if (thisBit == 1) {
                oneCount++;
                seenOne = true;
            } else {
                if (seenOne) return nextLargestHelper(n, i, oneCount);
            }
            shifted >>>= 1;
        }
        throw new NoSuchElementException();
    }

    private static int nextLargestHelper(int n, int index, int oneCount) {
        n |= 1 << index;
        int bitMask = -1 << index;
        int oneBits = oneCount == 1 ? 0 : -1 >>> (SEQUENCE_LENGTH - (oneCount - 1));
        return (n & bitMask) | oneBits;
    }
}
