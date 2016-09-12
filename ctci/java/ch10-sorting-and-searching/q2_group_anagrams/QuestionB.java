package q2_group_anagrams;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jjlee on 9/12/16.
 */
public class QuestionB {
    /* sort an array of strings so that all the anagrams are next to each other, by using a variation bucket sort */
    public static void groupAnagramsHashMap(String[] arr) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        AnagramComparator cmp = new AnagramComparator();
        for (String s : arr) {
            String sorted = cmp.sortChars(s);
            if (!map.containsKey(sorted)) map.put(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        int index = 0;
        for (String sorted : map.keySet()) {
            ArrayList<String> list = map.get(sorted);
            for (String s : list) {
                arr[index++] = s;
            }
        }
    }
}
