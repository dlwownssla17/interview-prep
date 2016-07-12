package q5_one_away;

/**
 * Created by jjlee on 7/11/16.
 */
public class Question {
    /* compare string lengths to use only one iteration */
    public static boolean oneEditAway(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1)
            return false;

        if (s1.length() < s2.length())
            return oneEditAwayHelper(s1, s2, false);
        else if (s1.length() > s2.length())
            return oneEditAwayHelper(s2, s1, false);
        else
            return oneEditAwayHelper(s1, s2, true);
    }

    /* helper fuction common for all three cases (insert, remove, replace) */
    private static boolean oneEditAwayHelper(String shorter, String longer, boolean forReplace) {
        boolean found = false;
        for (int i = 0; i < shorter.length(); i++) {
            if (shorter.charAt(i) != longer.charAt(!forReplace && found ? i + 1: i)) {
                if (found)
                    return false;
                found = true;
            }
        }
        return true;
    }
}
