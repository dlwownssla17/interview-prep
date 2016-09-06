package q9_parens;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by jjlee on 9/5/16.
 */
public class QuestionB {
    /* generate all valid combinations of n pairs of parentheses by inserting a parens where valid from solution
       for n - 1 (less efficient) */
    public static ArrayList<String> generateParensSubProblems(int n) {
        if (n == 0) {
            ArrayList<String> combinations = new ArrayList<>();
            combinations.add("");
            return combinations;
        }
        ArrayList<String> subCombinations = generateParensSubProblems(n - 1);
        HashSet<String> noDuplicates = new HashSet<>();
        for (String s : subCombinations) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') noDuplicates.add(s.substring(0, i + 1) + "()" + s.substring(i + 1));
            }
            noDuplicates.add("()" + s);
        }
        return new ArrayList<>(noDuplicates);
    }
}
