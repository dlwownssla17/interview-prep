package q4_palindrome_permutation;

/**
 * Created by jjlee on 7/10/16.
 */
public class Question {
    /* get character value */
    public static int getCharValue(char c) {
        char lowerC = Character.toLowerCase(c);
        if (lowerC >= 'a' && lowerC <= 'z')
            return lowerC - 'a';
        return -1;
    }

    /* use a bit vector and assume alphabets where lowercase == uppercase (i.e. 26 characters) */
    public static boolean isPermutationOfPalindrome(String s) {
        int countsOdd = 0;
        for (int i = 0; i < s.length(); i++) {
            int shift = getCharValue(s.charAt(i));
            if (shift != -1) {
                int bitMask = 1 << shift;
                countsOdd ^= bitMask;
            }
        }
        return (countsOdd & (countsOdd - 1)) == 0;
    }
}
