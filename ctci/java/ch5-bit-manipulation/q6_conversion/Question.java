package q6_conversion;

/**
 * Created by jjlee on 8/23/16.
 */
public class Question {
    /* compute number of bits to flip to convert integer a to integer b */
    public static int numberOfBitsToConvert(int a, int b) {
        int xor = a ^ b;
        int numBits = 0;
        while (xor != 0) {
            xor &= xor - 1;
            numBits++;
        }
        return numBits;
    }
}
