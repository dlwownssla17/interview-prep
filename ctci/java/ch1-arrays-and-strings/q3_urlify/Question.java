package q3_urlify;

/**
 * Created by jjlee on 7/10/16.
 */
public class Question {
    /* iterate backwards using char array */
    public static void urlify(char[] s, int len) {
        int numSpaces = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (s[i] == ' ')
                numSpaces++;
        }
        int urlIndex = len + 2 * numSpaces - 1;
        for (int i = len - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[urlIndex--] = '0';
                s[urlIndex--] = '2';
                s[urlIndex--] = '%';
            } else {
                s[urlIndex--] = s[i];
            }
        }
    }
}
