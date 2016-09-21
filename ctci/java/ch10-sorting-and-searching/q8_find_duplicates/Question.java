package q8_find_duplicates;

/**
 * Created by jjlee on 9/21/16.
 */
public class Question {
    /* find duplicates in an int array with all the numbers from 1 to N, where N is at most 32000, using a bit vector */
    public static void findDuplicates(int[] arr) {
        byte[] bitfield = new byte[4000];
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int nPred = n - 1;
            int bitMask = 1 << (nPred % 8);
            if ((bitfield[nPred / 8] & bitMask) == 0) bitfield[nPred / 8] |= bitMask;
            else System.out.println(n);
        }
    }
}
