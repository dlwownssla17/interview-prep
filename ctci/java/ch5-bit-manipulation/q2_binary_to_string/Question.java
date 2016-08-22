package q2_binary_to_string;

/**
 * Created by jjlee on 8/22/16.
 */
public class Question {
    /* iterate over fraction bits to convert double into binary representation */
    public static String toBinaryString(double d) {
        StringBuilder s = new StringBuilder(d > 0 ? "0." : "0");
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
}
