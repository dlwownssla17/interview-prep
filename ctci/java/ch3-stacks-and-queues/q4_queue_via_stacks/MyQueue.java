package q4_queue_via_stacks;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by jjlee on 8/16/16.
 */
/* queue implemented with two stacks */
public class MyQueue<T> {
    private Stack<T> pushStack;
    private Stack<T> popStack;
    private boolean lastAdded;

    public MyQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
        lastAdded = true;
    }

    public void add(T data) {
        if (!lastAdded) {
            transfer(popStack, pushStack);
            lastAdded = true;
        }
        pushStack.push(data);
    }

    public T remove() {
        removeOrPeek();
        return popStack.pop();
    }

    public T peek() {
        removeOrPeek();
        return popStack.peek();
    }

    private void removeOrPeek() {
        if (lastAdded) {
            transfer(pushStack, popStack);
            lastAdded = false;
        }
        if (popStack.isEmpty()) throw new NoSuchElementException();
    }

    private void transfer(Stack<T> fromStack, Stack<T> toStack) {
        while (!fromStack.isEmpty()) {
            toStack.push(fromStack.pop());
        }
    }
}
