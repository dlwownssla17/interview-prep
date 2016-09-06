package q9_parens;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jjlee on 9/5/16.
 */
public class QuestionA {
    /* generate all valid combinations of n pairs of parentheses by adding a left or right parens if valid */
    public static ArrayList<String> generateParens(int n) {
        ArrayList<String> combinations = new ArrayList<>();
        char[] parens = new char[2 * n];
        generateParensHelper(combinations, n, n, parens, 0);
        return combinations;
    }

    private static void generateParensHelper(ArrayList<String> combinations, int leftRemaining, int rightRemaining,
                                                          char[] parens, int index) {
        if (rightRemaining == 0) {
            combinations.add(new String(parens));
            return;
        }
        if (leftRemaining > 0) {
            parens[index] = '(';
            generateParensHelper(combinations, leftRemaining - 1, rightRemaining, parens, index + 1);
        }
        if (rightRemaining > leftRemaining) {
            parens[index] = ')';
            generateParensHelper(combinations, leftRemaining, rightRemaining - 1, parens, index + 1);
        }
    }
}
