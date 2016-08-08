package q1_three_in_one;

import sun.invoke.empty.Empty;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by jjlee on 8/7/16.
 */
public class MultiStack<T> {
    private T[] arr;
    private int[] top;
    private int[] bottom;
    private int numStacks;
    private int numItems = 0;

    /* dynamic multistack with given number of stacks and initial capacity that can change if exceeded
       (wrapping index) */
    public MultiStack(int numStacks, int initCapacity) {
        arr = (T[]) new Object[numStacks * initCapacity];
        top = new int[numStacks];
        bottom = new int[numStacks];
        for (int i = 0; i < numStacks; i++) {
            top[i] = i * initCapacity;
            bottom[i] = top[i];
        }
        this.numStacks = numStacks;
    }

    /* push with IllegalStateException if exceeds maximum total capacity but shifts stacks to the right
       if simply exceeds maximum capacity for stack with given stack index */
    public void push(int stackIndex, T item) {
        checkIndex(stackIndex);
        if (numItems >= arr.length) throw new IllegalStateException();
        if (isFull(stackIndex)) shiftRight(nextStackIndex(stackIndex));
        arr[top[stackIndex]] = item;
        top[stackIndex] = nextArrIndex(top[stackIndex]);
        numItems++;
    }

    /* pop with EmptyStackException if stack with given stack index is empty */
    public T pop(int stackIndex) {
        if (isEmpty(stackIndex)) throw new EmptyStackException();
        top[stackIndex] = prevArrIndex(top[stackIndex]);
        numItems--;
        return arr[top[stackIndex]];
    }

    /* peek with EmptyStackException if stack with given stack index is empty */
    public T peek(int stackIndex) {
        if (isEmpty(stackIndex)) throw new EmptyStackException();
        return arr[prevArrIndex(top[stackIndex])];
    }

    /* check if stack with given stack index is empty */
    public boolean isEmpty(int stackIndex) {
        checkIndex(stackIndex);
        return top[stackIndex] == bottom[stackIndex];
    }

    /* check if stack with given stack index is full */
    private boolean isFull(int stackIndex) {
        return top[stackIndex] == bottom[nextStackIndex(stackIndex)];
    }

    /* shift stack with given stack index one to the right
       (should not be called if all stacks are full -- thrown as IllegalStateException beforehand in push) */
    private void shiftRight(int stackIndex) {
        if (isFull(stackIndex)) shiftRight(nextStackIndex(stackIndex));
        if (!isEmpty(stackIndex)) {
            int i = prevArrIndex(top[stackIndex]);
            T temp = arr[i];
            while (i != bottom[stackIndex]) {
                arr[nextArrIndex(i)] = temp;
                i = prevArrIndex(i);
                temp = arr[i];
            }
            arr[nextArrIndex(i)] = temp;
        }
        top[stackIndex] = nextArrIndex(top[stackIndex]);
        bottom[stackIndex] = nextArrIndex(bottom[stackIndex]);
    }

    /* check if given stack index is valid */
    private void checkIndex(int stackIndex) {
        if (stackIndex >= numStacks) throw new IndexOutOfBoundsException();
    }

    /* next wrapping array index */
    private int nextArrIndex(int arrIndex) {
        return (arrIndex + 1) % arr.length;
    }

    /* previous wrapping array index */
    private int prevArrIndex(int arrIndex) {
        return arrIndex == 0 ? arr.length - 1 : arrIndex - 1;
    }

    /* next wrapping stack index */
    private int nextStackIndex(int stackIndex) {
        return (stackIndex + 1) % numStacks;
    }

    /* previous wrapping stack index */
    private int prevStackIndex(int stackIndex) {
        return stackIndex == 0 ? numStacks - 1 : stackIndex - 1;
    }
}
