package q5_sum_lists;

/**
 * Created by jjlee on 7/23/16.
 */
public class QuestionA {
    /* sum two lists where the digits are stored in reverse order */
    public static Node<Integer> sumLists(Node<Integer> a, Node<Integer> b) {
        if (a == null && b == null) return null;

        Node<Integer> head = new Node();
        Node<Integer> n = head;

        int carriage = 0;
        while (a != null || b != null || carriage == 1) {
            int op1 = a == null ? 0 : a.data;
            int op2 = b == null ? 0 : b.data;
            int result = op1 + op2 + carriage;
            if (result >= 10) {
                result -= 10;
                carriage = 1;
            }
            else {
                carriage = 0;
            }

            n.data = result;

            if (a != null) a = a.next;
            if (b != null) b = b.next;

            if (a != null || b != null || carriage == 1) {
                n.next = new Node();
                n = n.next;
            }
        }

        return head;
    }

//    /* sum two lists where the digits are stored in reverse order (prune when one of the lists reaches null) */
//    public static Node<Integer> sumListsPrune(Node<Integer> a, Node<Integer> b) {
//        Node<Integer> head = null;
//        Node<Integer> n = head;
//
//        int carriage = 0;
//        while (a != null || b != null) {
//            if (a == null) {
//                n.next = b;
//                if (carriage == 1) updateWithCarriage(b);
//            }
//
//            if (a != null) a = a.next;
//            if (b != null) b = b.next;
//        }
//
//        return head;
//    }
//
//    private static void updateWithCarriage(Node<Integer> head) {
//        Node<Integer> n = head;
//        int carriage = 1;
//        while (carriage == 1) {
//            if (n == null) n = new Node(1);
//        }
//    }
}
