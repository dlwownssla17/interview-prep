package q1_is_unique;

import java.util.HashSet;

/**
 * Created by jjlee on 7/2/16.
 */
public class QuestionA {
    /* assume ASCII */
    public static boolean isUnique(String s) {
        if (s.length() > 128)
            return false;

        boolean[] exists = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (exists[c])
                return false;
            exists[c] = true;
        }
        return true;
    }

    /* no assumption */
    public static boolean isUniqueNoAssumption(String s) {
        HashSet<Character> exists = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (exists.contains(c))
                return false;
            exists.add(c);
        }
        return true;
    }
}
