package q1_three_in_one;

import java.util.EmptyStackException;

/**
 * Created by jjlee on 8/7/16.
 */
public class FixedMultiStack<T> {
    private T[] arr;
    private int[] top;
    private int numStacks;
    private int maxCapacity;

    /* fixed multistack with given number of stacks and maximum capacity */
    public FixedMultiStack(int numStacks, int maxCapacity) {
        arr = (T[]) new Object[numStacks * maxCapacity];
        top = new int[numStacks];
        for (int i = 0; i < numStacks; i++) {
            top[i] = i * maxCapacity;
        }
        this.numStacks = numStacks;
        this.maxCapacity = maxCapacity;
    }

    /* push with IllegalStateException if exceeds maximum capacity for stack with given stack index */
    public void push(int stackIndex, T item) {
        checkIndex(stackIndex);
        if (top[stackIndex] >= (stackIndex + 1) * maxCapacity) throw new IllegalStateException();
        arr[top[stackIndex]++] = item;
    }

    /* pop with EmptyStackException if stack with given stack index is empty */
    public T pop(int stackIndex) {
        if (isEmpty(stackIndex)) throw new EmptyStackException();
        return arr[--top[stackIndex]];
    }

    /* peek with EmptyStackException if stack with given stack index is empty */
    public T peek(int stackIndex) {
        if (isEmpty(stackIndex)) throw new EmptyStackException();
        return arr[top[stackIndex] - 1];
    }

    /* check if stack with given stack index is empty */
    public boolean isEmpty(int stackIndex) {
        checkIndex(stackIndex);
        return top[stackIndex] == stackIndex * maxCapacity;
    }

    /* check if given stack index is valid */
    private void checkIndex(int stackIndex) {
        if (stackIndex >= numStacks) throw new IndexOutOfBoundsException();
    }
}
