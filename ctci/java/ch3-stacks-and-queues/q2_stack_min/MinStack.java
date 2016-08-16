package q2_stack_min;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by jjlee on 8/7/16.
 */
/* MinStack using node that have reference to the min node up to itself */
public class MinStack<T extends Comparable<? super T>> {
    Stack<MinStackNode<T>> stack = new Stack<>();

    public void push(T item) {
        MinStackNode<T> thisNode = new MinStackNode<>(item);
        thisNode.min = !stack.isEmpty() && item.compareTo(stack.peek().min.data) != -1 ?
                stack.peek().min : thisNode;
        stack.push(thisNode);
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        return stack.pop().data;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack.peek().data;
    }

    public T min() {
        if (isEmpty()) throw new EmptyStackException();
        return stack.peek().min.data;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    private class MinStackNode<T extends Comparable<? super T>> {
        private T data;
        private MinStackNode<T> min;

        private MinStackNode(T data) {
            this.data = data;
        }
    }
}
