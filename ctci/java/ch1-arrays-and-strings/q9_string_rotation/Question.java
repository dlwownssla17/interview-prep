package q9_string_rotation;

/**
 * Created by jjlee on 7/12/16.
 */
public class Question {
    /* check if substring of duplicated string */
    public static boolean isRotation(String s1, String s2) {
        return isSubstring(s1 + s1, s2);
    }

    /* check if substring */
    private static boolean isSubstring(String s1, String s2) {
        return s1.indexOf(s2) >= 0;
    }
}
