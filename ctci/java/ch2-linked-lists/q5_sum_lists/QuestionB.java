package q5_sum_lists;

/**
 * Created by jjlee on 7/23/16.
 */
public class QuestionB {
    /* sum two lists where the digits are stored in forward order */
    public static Node<Integer> sumListsForwardOrder(Node<Integer> a, Node<Integer> b) {
        int aLength = getLength(a);
        int bLength = getLength(b);
        Node<Integer> paddedA = padList(a, bLength - aLength);
        Node<Integer> paddedB = padList(b, aLength - bLength);

        PartialSum ps = sumListsForwardOrderSameLengths(paddedA, paddedB);
        if (ps.carriage) {
            Node<Integer> thisDigit = new Node(1);
            thisDigit.next = ps.sum;
            return thisDigit;
        }
        return ps.sum;
    }

    private static int getLength(Node<Integer> n) {
        if (n == null) return 0;
        return 1 + getLength(n.next);
    }

    private static Node<Integer> padList(Node<Integer> n, int pad) {
        if (pad <= 0) return n;
        Node<Integer> newNode = new Node(0);
        newNode.next = padList(n, pad - 1);
        return newNode;
    }

    private static PartialSum sumListsForwardOrderSameLengths(Node<Integer> a, Node<Integer> b) {
        PartialSum ps = new PartialSum();
        if (a == null && b == null) return ps;

        PartialSum nextPs = sumListsForwardOrderSameLengths(a.next, b.next);
        int result = a.data + b.data + (nextPs.carriage ? 1 : 0);
        if (result >= 10) {
            result -= 10;
            ps.carriage = true;
        }
        Node<Integer> thisDigit = new Node(result);
        thisDigit.next = nextPs.sum;
        ps.sum = thisDigit;
        return ps;
    }

    private static class PartialSum {
        private Node<Integer> sum;
        private boolean carriage;
    }
}
