package q4_power_set;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jjlee on 8/23/16.
 */
public class QuestionA {

    public static <T> ArrayList<ArrayList<T>> powerSet(ArrayList<T> set) {
        if (set.isEmpty()) return new ArrayList<>();
        return powerSetHelper(set);
    }

    private static <T> ArrayList<ArrayList<T>> powerSetHelper(ArrayList<T> set) {
        if (set.isEmpty()) {
            ArrayList<ArrayList<T>> baseSet = new ArrayList<>();
            baseSet.add(new ArrayList<>());
            return baseSet;
        }
        T item = set.remove(set.size() - 1);
        ArrayList<ArrayList<T>> powerSet = powerSetHelper(set);
        ArrayList<ArrayList<T>> powerSetWithThisItem = new ArrayList<>();
        for (ArrayList<T> subset : powerSet) {
            ArrayList<T> newSubset = new ArrayList<>();
            newSubset.addAll(subset);
            newSubset.add(item);
            powerSetWithThisItem.add(newSubset);
        }
        powerSet.addAll(powerSetWithThisItem);
        return powerSet;
    }
}
