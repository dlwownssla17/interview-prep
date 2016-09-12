package q1_sorted_merge;

/**
 * Created by jjlee on 9/12/16.
 */
public class Question {
    /* merge two sorted arrays A and B where A has a large enough buffer at the end to hold B, from right to left */
    public static void merge(int[] a, int[] b, int lastA, int lastB) {
        int indexA = lastA - 1;
        int indexB = lastB - 1;
        int indexCurrent = lastA + lastB - 1;
        while (indexB >= 0) {
            if (indexA >= 0 && a[indexA] > b[indexB]) {
                a[indexCurrent] = a[indexA];
                indexA--;

            } else {
                a[indexCurrent] = b[indexB];
                indexB--;
            }
            indexCurrent--;
        }
    }
}
