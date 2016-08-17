package q3_delete_middle_node;

import utils.Node;

/**
 * Created by jjlee on 7/23/16.
 */
public class Question {
    /* copy data from next node and then delete next node (does not work for last node) */
    public static boolean deleteNode(Node n) {
        if (n == null || n.next == null) return false;

        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }
}
