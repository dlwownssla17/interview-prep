package q2_return_kth_to_last;

/**
 * Created by jjlee on 7/23/16.
 */
public class Question {
    /* use runner technique (last element is 0th to last) */
    public static Node returnKthToLast(Node head, int k) {
        Node runner1 = head;
        Node runner2 = head;
        for (int i = 0; i <= k; i++) {
            if (runner1 == null) throw new IllegalArgumentException("k longer than length of list.");
            runner1 = runner1.next;
        }
        while (runner1 != null) {
            runner1 = runner1.next;
            runner2 = runner2.next;
        }
        return runner2;
    }
}
