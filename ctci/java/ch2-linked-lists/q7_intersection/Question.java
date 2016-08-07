package q7_intersection;

/**
 * Created by jjlee on 8/7/16.
 */
public class Question {
    /* find intersection between two linked lists with get length and pointers */
    public static Node findIntersection(Node a, Node b) {
        if (a != null && b != null) {
            int aLength = 1;
            int bLength = 1;
            Node aPtr = a;
            Node bPtr = b;
            while (aPtr.next != null) {
                aPtr = aPtr.next;
                aLength++;
            }
            while (bPtr.next != null) {
                bPtr = bPtr.next;
                bLength++;
            }

            if (aPtr != bPtr) return null;

            Node shorter = aLength <= bLength ? a : b;
            Node longer = aLength <= bLength ? b : a;
            for (int i = 0; i < Math.abs(bLength - aLength); i++) {
                longer = longer.next;
            }
            while (shorter != null && longer != null) {
                if (shorter == longer) return longer;
                shorter = shorter.next;
                longer = longer.next;
            }
        }
        return null;
    }
}
