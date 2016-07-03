package q1_is_unique;

/**
 * Created by jjlee on 7/2/16.
 */
public class QuestionB {
    /* use a bit vector and assume lowercase alphabets (i.e. 26 characters) */
    public static boolean isUniqueNoAdditionalDataStructure(String s) {
        if (s.length() > 26)
            return false;

        int exists = 0;
        for (int i = 0; i < s.length(); i++) {
            int bitMask = 1 << (s.charAt(i) - 'a');
            if ((exists & bitMask) > 0)
                return false;
            else
                exists |= bitMask;
        }
        return true;
    }
}
