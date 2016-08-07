package q7_intersection;

/**
 * Created by jjlee on 8/7/16.
 */
public class Question {

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

            if (aLength <= bLength) {
                for (int i = 0; i < bLength - aLength; i++) {
                    b = b.next;
                }
            } else {
                for (int i = 0; i < aLength - bLength; i++) {
                    a = a.next;
                }
            }
            while (a != null && b != null) {
                if (a == b) return a;
                a = a.next;
                b = b.next;
            }
        }
        return null;
    }
}
