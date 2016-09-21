package q7_missing_int;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by jjlee on 9/21/16.
 */
public class QuestionA {
    /* use a big vector (byte array) to map all possible integers and find the missing int */
    public static int findMissingInt(String filename) throws FileNotFoundException {
        long numberOfInts = ((long) Integer.MAX_VALUE) + 1;
        byte[] bitfield = new byte [(int) (numberOfInts / 8)];
        Scanner in = new Scanner(new FileReader(filename));
        while (in.hasNextInt()) {
            int n = in.nextInt();
            bitfield[n / 8] |= 1 << (n % 8);
        }
        for (int i = 0; i < bitfield.length; i++) {
            for (int j = 0; j < 8; j++) {
                if ((bitfield[i] & (1 << j)) == 0) {
                    return i * 8 + j;
                }
            }
        }
        return -1;
    }
}
