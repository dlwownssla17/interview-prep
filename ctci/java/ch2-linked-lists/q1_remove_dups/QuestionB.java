package q1_remove_dups;

/**
 * Created by jjlee on 7/23/16.
 */
public class QuestionB {
    /* remove duplicates with N^2 check */
    public static void removeDupsNoTemporaryBuffer(Node head) {
        Node current = head;
        while (current != null) {
            Node n = current;
            while (n.next != null) {
                if (n.next.data.equals(current.data)) n.next = n.next.next;
                else n = n.next;
            }
            current = current.next;
        }
    }
}
