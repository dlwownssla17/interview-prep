package q4_partition;

/**
 * Created by jjlee on 7/23/16.
 */
public class Question {

    public static Node partition(Node<Integer> head, int x) {
        Node<Integer> dummy = new Node<>();
        Node<Integer> lastLess = dummy;
        lastLess.next = head;

        Node<Integer> n = head;
        while (n != null && n.data < x) {
            lastLess = lastLess.next;
            n = n.next;
        }

        Node<Integer> prev = lastLess;
        while (n != null) {
            if (n.data < x) {
                prev.next = n.next;
                n.next = lastLess.next;
                lastLess.next = n;
                n = prev.next;
                lastLess = lastLess.next;
            }
            else {
                prev = prev.next;
                n = n.next;
            }
        }

        return dummy.next;
    }

    public static Node partitionTwoDummyNodes(Node<Integer> head, int x) {
        Node<Integer> dummyLess = new Node<>();
        Node<Integer> currentLastLess = dummyLess;
        Node<Integer> dummyMore = new Node<>();
        Node<Integer> currentLastMore = dummyMore;

        Node<Integer> n = head;
        while (n != null) {
            if (n.data < x) {
                currentLastLess.next = n;
                currentLastLess = currentLastLess.next;
            }
            else {
                currentLastMore.next = n;
                currentLastMore = currentLastMore.next;
            }
            n = n.next;
        }

        currentLastLess.next = dummyMore.next;
        currentLastMore.next = null;

        return dummyLess.next;
    }
}
