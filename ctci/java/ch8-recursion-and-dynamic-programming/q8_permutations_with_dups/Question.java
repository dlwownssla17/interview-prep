package q8_permutations_with_dups;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jjlee on 9/5/16.
 */
public class Question {
    /* compute all permutations of a string with duplicate characters by keeping track of the counts of each character */
    public static ArrayList<String> permutationsWithDups(String s) {
        HashMap<Character, Integer> counts = buildCounts(s);
        ArrayList<String> permutations = new ArrayList<>();
        permutationsWithDupsHelper(permutations, counts, s.length(), new ArrayList<>());
        return permutations;
    }

    private static HashMap<Character, Integer> buildCounts(String s) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!counts.containsKey(c)) counts.put(c, 0);
            counts.put(c, counts.get(c) + 1);
        }
        return counts;
    }

    private static void permutationsWithDupsHelper(ArrayList<String> permutations,
                                                                HashMap<Character, Integer> counts, int remaining,
                                                                ArrayList<Character> buf) {
        if (remaining == 0) {
            StringBuilder sb = new StringBuilder();
            for (char c : buf) {
                sb.append(c);
            }
            permutations.add(sb.toString());
            return;
        }
        for (char c : counts.keySet()) {
            int count = counts.get(c);
            if (count > 0) {
                counts.put(c, count - 1);
                buf.add(c);
                permutationsWithDupsHelper(permutations, counts, remaining - 1, buf);
                buf.remove(buf.size() - 1);
                counts.put(c, count);
            }
        }
    }
}
