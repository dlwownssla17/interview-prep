package q5_sort_stack;

import java.util.Stack;

/**
 * Created by jjlee on 8/16/16.
 */
public class QuestionA {
    /* sort stack with one additional stack */
    public static <T extends Comparable<? super T>> Stack sortWithOneAdditionalStack(Stack<T> s) {
        Stack<T> temp = new Stack<>();
        while (!s.isEmpty()) {
            T data = s.pop();
            while (!temp.isEmpty() && temp.peek().compareTo(data) == -1) {
                s.push(temp.pop());
            }
            temp.push(data);
        }
        return temp;
    }
}
