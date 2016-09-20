package q5_sparse_search;

/**
 * Created by jjlee on 9/20/16.
 */
public class Question {
    /* use modified binary search that looks for valid middle index */
    public static int sparseSearch(String[] arr, String s) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].isEmpty()) {
                int left = mid - 1;
                int right = mid + 1;
                while (true) {
                    if (left < low && right > high) {
                        return -1;
                    } else if (left >= low && !arr[left].isEmpty()) {
                        mid = left;
                        break;
                    } else if (right <= high && !arr[right].isEmpty()) {
                        mid = right;
                        break;
                    }
                    left--;
                    right++;
                }
            }
            if (arr[mid].equals(s)) return mid;
            else if (arr[mid].compareTo(s) > 0) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
