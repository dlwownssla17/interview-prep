package q4_sorted_search_no_size;

/**
 * Created by jjlee on 9/19/16.
 */
public class Question {
    /* find the length of the listy for binary search by doubling index in O(log n) time */
    public static int sortedSearchNoSize(Listy listy, int x) {
        int index = 1;
        while (listy.elementAt(index) != -1 && listy.elementAt(index) < x) {
            index *= 2;
        }
        int low = index / 2;
        int high = index;
        while (low <= high) {
            int mid = (low + high) / 2;
            int elem = listy.elementAt(mid);
            if (x == elem) return mid;
            else if (elem == -1 || x < elem) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
