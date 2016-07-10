package q2_check_permutation;

import java.util.Arrays;

/**
 * Created by jjlee on 7/10/16.
 */
public class QuestionB {
    /* use sort (nlogn) */
    public static boolean checkPermutationWithSort(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        Arrays.sort(cs1);
        Arrays.sort(cs2);
        return Arrays.equals(cs1, cs2);
    }
}
