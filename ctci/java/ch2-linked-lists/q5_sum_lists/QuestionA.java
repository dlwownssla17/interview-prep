package q5_sum_lists;

/**
 * Created by jjlee on 7/23/16.
 */
public class QuestionA {
    /* sum two lists where the digits are stored in reverse order */
    public static Node<Integer> sumLists(Node<Integer> a, Node<Integer> b) {
        return sumListsHelper(a, b, false);
    }

    private static Node<Integer> sumListsHelper(Node<Integer> a, Node<Integer> b, boolean carriage) {
        if (a == null && b == null) return carriage ? new Node(1) : null;

        int result = (a != null ? a.data : 0) + (b != null ? b.data : 0) + (carriage ? 1 : 0);
        boolean nextCarriage = false;
        if (result >= 10) {
            result -= 10;
            nextCarriage = true;
        }
        Node<Integer> thisDigit = new Node(result);
        Node<Integer> nextDigits = sumListsHelper(a != null ? a.next : null, b != null ? b.next : null, nextCarriage);
        thisDigit.next = nextDigits;
        return thisDigit;
    }
}
