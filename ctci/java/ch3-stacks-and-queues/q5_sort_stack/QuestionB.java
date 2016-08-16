package q5_sort_stack;

import java.util.Stack;

/**
 * Created by jjlee on 8/16/16.
 */
public class QuestionB {
    /* sort stack using merge sort */
    public static <T extends Comparable<? super T>> void sortWithMergeSort(Stack<T> s) {
        if (s.size() <= 1) return;

        Stack<T> t = new Stack<>();
        while (s.size() > t.size() + 1) t.push(s.pop());
        sortWithMergeSort(s);
        sortWithMergeSort(t);
        merge(s, t);
    }

    /* merge two sorted stacks to form a sorted stack */
    private static <T extends Comparable<? super T>> void merge(Stack<T> s, Stack<T> t) {
        Stack<T> u = new Stack<>();
        while (!t.isEmpty()) u.push(t.pop());
        while (!s.isEmpty()) t.push(s.pop());
        while (!t.isEmpty() || !u.isEmpty()) {
            if (t.isEmpty()) s.push(u.pop());
            else if (u.isEmpty()) s.push(t.pop());
            else if (t.peek().compareTo(u.peek()) == -1) s.push(u.pop());
            else s.push(t.pop());
        }
    }
}
