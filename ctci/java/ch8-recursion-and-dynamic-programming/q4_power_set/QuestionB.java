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
}
