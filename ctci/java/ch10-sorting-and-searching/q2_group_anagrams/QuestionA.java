package q2_group_anagrams;

import java.util.Arrays;

/**
 * Created by jjlee on 9/12/16.
 */
public class QuestionA {
    /* sort an array of strings so that all the anagrams are next to each other, by implementing a comparator that
       compares the sorted strings */
    public static void groupAnagrams(String[] arr) {
        Arrays.sort(arr, new AnagramComparator());
    }
}
