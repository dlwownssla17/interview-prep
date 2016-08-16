package q4_queue_via_stacks;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by jjlee on 8/16/16.
 */
/* queue implemented with in and out stacks (faster for back-to-back add and remove operations) */
public class MyQueue2<T> {
    private Stack<T> in;
    private Stack<T> out;

    public MyQueue2() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void add(T data) {
        in.push(data);
    }

    public T remove() {
        removeOrPeek();
        return out.pop();
    }

    public T peek() {
        removeOrPeek();
        return out.peek();
    }

    private void removeOrPeek() {
        if (in.isEmpty() && out.isEmpty()) throw new NoSuchElementException();
        if (out.isEmpty()) transferFromInToOut();
    }

    private void transferFromInToOut() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }
}
