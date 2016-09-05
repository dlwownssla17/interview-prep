package q7_permutations_without_dups;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by jjlee on 9/4/16.
 */
public class QuestionA {
    /* compute all permutations of a string of unique characters by picking a character to append at the end */
    public static ArrayList<String> permutationsWithoutDups(String s) {
        ArrayList<String> permutations = new ArrayList<>();
        permutationsWithoutDupsHelper(s, new ArrayList<>(), permutations);
        return permutations;
    }

    private static void permutationsWithoutDupsHelper(String rem, ArrayList<Character> buf, ArrayList<String> permutations) {
        if (rem.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (char c : buf) {
                sb.append(c);
            }
            permutations.add(sb.toString());
            return;
        }
        for (int i = 0; i < rem.length(); i++) {
            buf.add(rem.charAt(i));
            permutationsWithoutDupsHelper(rem.substring(0, i) + rem.substring(i + 1), buf, permutations);
            buf.remove(buf.size() - 1);
        }
    }
}
