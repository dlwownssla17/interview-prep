package q3_magic_index;

/**
 * Created by jjlee on 8/23/16.
 */
public class Question {
    /* use binary search iteratively (O(logN) time, O(1) space) */
    public static int getMagicIndex(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == mid) return mid;
            else if (arr[mid] < mid) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    /* use binary search recursively (O(logN) time, O(logN) space) */
    public static int getMagicIndexRecursive(int[] arr) {
        return getMagicIndexRecursiveHelper(arr, 0, arr.length -1);
    }

    private static int getMagicIndexRecursiveHelper(int[] arr, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == mid) return mid;
        else if (arr[mid] < mid) return getMagicIndexRecursiveHelper(arr, mid + 1, high);
        else return getMagicIndexRecursiveHelper(arr, low, mid - 1);
    }

    /* must check both sides because of duplicates (O(N) time, O(logN) space) */
    public static int getMagicIndexDup(int[] arr) {
        return getMagicIndexDupRecursiveHelper(arr, 0, arr.length - 1);
    }

    private static int getMagicIndexDupRecursiveHelper(int[] arr, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == mid) return mid;
        else if (arr[mid] < mid) {
            int right = getMagicIndexDupRecursiveHelper(arr, mid + 1, high);
            if (right != -1 || arr[mid] < 0) return right;
            return getMagicIndexDupRecursiveHelper(arr, low, arr[mid]);
        } else {
            int left = getMagicIndexDupRecursiveHelper(arr, low, mid - 1);
            if (left != -1 || arr[mid] >= arr.length) return left;
            return getMagicIndexDupRecursiveHelper(arr, arr[mid], high);
        }
    }
}
