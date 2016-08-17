package q8_loop_detection;

import utils.Node;

/**
 * Created by jjlee on 8/7/16.
 */
public class Question {
    /* detect beginning of loop with runners */
    public static Node detectLoopBeginning(Node head) {
        Node runner1 = head;
        Node runner2 = head;
        do {
            runner1 = runner1.next;
            runner2 = runner2.next.next;
        } while (runner1 != runner2);
        runner2 = head;
        while (runner1 != runner2) {
            runner1 = runner1.next;
            runner2 = runner2.next;
        }
        return runner1;
    }
}
