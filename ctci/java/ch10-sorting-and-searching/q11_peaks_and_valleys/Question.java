package q11_peaks_and_valleys;

/**
 * Created by jjlee on 9/22/16.
 */
public class Question {
    /* convert int array to peaks and valleys (starting with peak) by swapping with next index if not valid (O(n)) */
    public static void toPeaksAndValleys(int[] arr) {
        boolean shouldBePeak = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((shouldBePeak && arr[i] < arr[i + 1]) || (!shouldBePeak && arr[i] > arr[i + 1])) swap(arr, i, i + 1);
            shouldBePeak = !shouldBePeak;
        }
    }

    /* convert int array to peaks and valleys (starting with peak) by swapping with max index if not valid for every
       other index for peaks, automatically taking care of valleys (O(n)) */
    public static void toPeaksAndValleysEveryOther(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            int maxIndex = maxIndexAmongAdjacents(arr, i);
            if (maxIndex != i) swap(arr, i, maxIndex);
        }
    }

    private static int maxIndexAmongAdjacents(int[] arr, int i) {
        int prev = i - 1 >= 0 ? arr[i - 1] : Integer.MIN_VALUE;
        int next = i + 1 < arr.length ? arr[i + 1] : Integer.MIN_VALUE;
        int max = Math.max(prev, Math.max(arr[i], next));
        if (max == prev) return i - 1;
        else if (max == next) return i + 1;
        else return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
