package q2_check_permutation;

import java.util.HashMap;

/**
 * Created by jjlee on 7/10/16.
 */
public class QuestionA {
    /* assume ASCII */
    public static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] counts = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            counts[c1]++;
            counts[c2]--;
        }
        for (int count : counts) {
            if (count != 0)
                return false;
        }
        return true;
    }

    /* no assumption */
    public static boolean checkPermutationNoAssumption(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            counts.put(c1, (counts.containsKey(c1) ? counts.get(c1) : 0) + 1);
            counts.put(c2, (counts.containsKey(c2) ? counts.get(c2) : 0) - 1);
        }
        for (char c : counts.keySet()) {
            if (counts.get(c) != 0)
                return false;
        }
        return true;
    }
}
