package q2_binary_to_string;

/**
 * Created by jjlee on 8/22/16.
 */
public class Question {
    /* iterate over fraction bits to convert double into binary representation */
    public static String toBinaryString(double d) {
        if (d == 0) return "0";
        StringBuilder s = new StringBuilder("0.");
        int i = 0;
        double frac = 0.5;
        while (d > 0 && i < 32) {
            if (d >= frac) {
                s.append('1');
                d -= frac;
            } else {
                s.append('0');
            }
            frac /= 2;
            i++;
        }
        if (d > 0) return "ERROR";
        return s.toString();
    }

    /* iterate over integer bits to convert int into binary representation */
    public static String toBinaryString(int n) {
        if (n == 0) return "0";
        StringBuilder s = new StringBuilder();
        while (n != 0) {
            s.insert(0, n & 1);
            n >>>= 1;
        }
        return s.toString();
    }
}
