package q1_remove_dups;

import java.util.HashSet;

/**
 * Created by jjlee on 7/23/16.
 */
public class QuestionA {
    /* remove duplicates with hashset */
    public static void removeDups(Node head) {
        if (head == null) return;

        HashSet exists = new HashSet();

        exists.add(head.data);

        Node n = head;
        while (n.next != null) {
            if (exists.contains(n.next.data)) {
                n.next = n.next.next;
            }
            else {
                exists.add(n.next.data);
                n = n.next;
            }
        }
    }
}
