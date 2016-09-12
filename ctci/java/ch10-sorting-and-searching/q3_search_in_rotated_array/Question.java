package q3_search_in_rotated_array;

/**
 * Created by jjlee on 9/12/16.
 */
public class Question {
    /* search in rotated array, by comparing with leftmost or rightmost element in addition to binary search */
    public static int searchInRotatedArray(int[] arr, int x) {
        return searchInRotatedArray(arr, x, 0, arr.length - 1);
    }

    private static int searchInRotatedArray(int[] arr, int x, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (x == arr[mid]) return mid;
        if (arr[low] < arr[mid]) {
            if (x >= arr[low] && x < arr[mid]) return searchInRotatedArray(arr, x, low, mid - 1);
            else return searchInRotatedArray(arr, x, mid + 1, high);
        } else if (arr[low] > arr[mid]) {
            if (x <= arr[high] && x > arr[mid]) return searchInRotatedArray(arr, x, mid + 1, high);
            else return searchInRotatedArray(arr, x, low, mid - 1);
        } else {
            if (arr[high] != arr[mid]) return searchInRotatedArray(arr, x, mid + 1, high);
            int result = searchInRotatedArray(arr, x, low, mid - 1);
            return result == -1 ? searchInRotatedArray(arr, x, mid + 1, high) : result;
        }
    }
}
