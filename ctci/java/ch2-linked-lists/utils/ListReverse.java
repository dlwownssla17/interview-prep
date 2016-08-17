package utils;

/**
 * Created by jjlee on 7/31/16.
 */
public class ListReverse {

    public static Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node remaining = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return remaining;
    }

    public static Node reverseIterative(Node head) {
        Node n = head;
        Node prev = null;
        while (n != null) {
            Node next = n.next;
            n.next = prev;
            prev = n;
            n = next;
        }
        return prev;
    }
}
