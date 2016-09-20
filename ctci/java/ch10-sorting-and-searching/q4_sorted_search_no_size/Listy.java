package q4_sorted_search_no_size;

import java.util.ArrayList;

/**
 * Created by jjlee on 9/19/16.
 */
public class Listy {
    ArrayList<Integer> list;

    public Listy() {
        list = new ArrayList<>();
    }

    public void add(int item) {
        if (item <= 0) throw new IllegalArgumentException();
        list.add(item);
    }

    public int elementAt(int i) {
        return i < list.size() ? list.get(i) : -1;
    }
}
