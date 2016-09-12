package q2_group_anagrams;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jjlee on 9/12/16.
 */
public class AnagramComparator implements Comparator<String> {
    public String sortChars(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    @Override
    public int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }
}
