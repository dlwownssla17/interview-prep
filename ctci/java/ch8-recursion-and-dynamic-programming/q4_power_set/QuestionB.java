package q4_power_set;

import java.util.ArrayList;

/**
 * Created by jjlee on 8/23/16.
 */
public class QuestionB {
    /* compute all subsets of given set using recursion including or excluding the item at each index */
    public static <T> ArrayList<ArrayList<T>> powerSetIncludeExclude(ArrayList<T> set) {
        if (set.isEmpty()) return new ArrayList<>();
        ArrayList<ArrayList<T>> powerSet = new ArrayList<>();
        computeSubsets(set, powerSet, 0, new ArrayList<>());
        return powerSet;
    }

    private static <T> void computeSubsets(ArrayList<T> set, ArrayList<ArrayList<T>> powerSet, int index, ArrayList<T> buf) {
        if (index >= set.size()) {
            ArrayList<T> newSubset = new ArrayList<>();
            newSubset.addAll(buf);
            powerSet.add(newSubset);
            return;
        }
        computeSubsets(set, powerSet, index + 1, buf);
        T item = set.get(index);
        buf.add(item);
        computeSubsets(set, powerSet, index + 1, buf);
        buf.remove(buf.size() - 1);
    }

    /* compute all subsets of given set using combinatorics with binary representation of integers (similar to above) */
    public static <T> ArrayList<ArrayList<T>> powerSetCombinatorics(ArrayList<T> set) {
        if (set.isEmpty()) return new ArrayList<>();
        int max = 1 << set.size();
        ArrayList<ArrayList<T>> powerSet = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            powerSet.add(convertIntToSubset(set, i));
        }
        return powerSet;
    }

    private static <T> ArrayList<T> convertIntToSubset(ArrayList<T> set, int x) {
        int index = 0;
        ArrayList<T> subset = new ArrayList<>();
        for (int i = x; i > 0; i >>>= 1) {
            if ((i & 1) == 1) subset.add(set.get(index));
            index++;
        }
        return subset;
    }
}
