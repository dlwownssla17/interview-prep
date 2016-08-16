package q3_stack_of_plates;

import java.util.EmptyStackException;

/**
 * Created by jjlee on 8/16/16.
 */
/* custom stack with access to top and bottom nodes, where each node has reference to the nodes above and below */
public class Stack<T> {
    private int capacity;
    private StackNode<T> top;
    private StackNode<T> bottom;

    public void push(T data) {
        StackNode<T> newTop = new StackNode<>(data);
        if (top != null) {
            top.above = newTop;
            newTop.below = top;
        } else {
            bottom = newTop;
        }
        top = newTop;
        capacity++;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T data = top.data;
        top = top.below;
        if (top == null) bottom = null;
        capacity--;
        return data;
    }

    public T popBottom() {
        if (bottom == null) throw new EmptyStackException();
        T data = bottom.data;
        bottom = bottom.above;
        if (bottom == null) top = null;
        capacity--;
        return data;
    }

    public int getCapacity() {
        return capacity;
    }

    private class StackNode<T> {
        private T data;
        private StackNode above;
        private StackNode below;

        private StackNode(T data) {
            this.data = data;
        }
    }
}
