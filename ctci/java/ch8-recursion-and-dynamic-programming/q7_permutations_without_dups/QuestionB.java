package q7_permutations_without_dups;

import java.util.ArrayList;

/**
 * Created by jjlee on 9/4/16.
 */
public class QuestionB {
    /* compute all permutations of a string of unique characters by using the solution of its substring from index 1 */
    public static ArrayList<String> permutationsWithoutDupsSubProblems(String s) {
        if (s.isEmpty()) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> permutationsSubString = permutationsWithoutDupsSubProblems(s.substring(1));
        ArrayList<String> permutations = new ArrayList<>();
        char c = s.charAt(0);
        for (String permutation : permutationsSubString) {
            for (int i = 0; i <= permutation.length(); i++) {
                permutations.add(permutation.substring(0, i) + c + permutation.substring(i));
            }
        }
        return permutations;
    }
}
