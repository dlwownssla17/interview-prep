package q2_stack_min;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by jjlee on 8/7/16.
 */
public class MinStack2<T extends Comparable<? super T>> {
    Stack<T> stack = new Stack<>();
    Stack<T> minStack = new Stack<>();

    public void push(T item) {
        if (isEmpty() || item.compareTo(minStack.peek()) != 1) minStack.push(item);
        stack.push(item);
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T poppedItem = stack.pop();
        if (poppedItem.equals(minStack.peek())) minStack.pop();
        return poppedItem;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack.peek();
    }

    public T min() {
        if (isEmpty()) throw new EmptyStackException();
        return minStack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
