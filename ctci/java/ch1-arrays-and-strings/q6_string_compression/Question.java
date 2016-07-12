package q6_string_compression;

/**
 * Created by jjlee on 7/12/16.
 */
public class Question {
    /* one iteration with neighbor character comparison */
    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int countConsecutive = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                countConsecutive++;
            } else {
                sb.append(s.charAt(i));
                sb.append(countConsecutive);
                countConsecutive = 1;
            }
        }
        return sb.length() >= s.length() ? s : sb.toString();
    }
}
