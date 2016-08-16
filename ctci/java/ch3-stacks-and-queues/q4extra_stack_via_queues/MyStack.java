package q4extra_stack_via_queues;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jjlee on 8/16/16.
 */
/* stack implemented with two queues */
public class MyStack<T> {
    Queue<T> mainQueue;
    Queue<T> tempQueue;

    public MyStack() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(T data) {
        mainQueue.add(data);
    }

    public T pop() {
        popOrPeek();
        return tempQueue.remove();
    }

    public T peek() {
        popOrPeek();
        T data = tempQueue.remove();
        mainQueue.add(data);
        return data;
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }

    private void popOrPeek() {
        if (isEmpty()) throw new EmptyStackException();
        Queue<T> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;
        while (tempQueue.size() > 1) {
            mainQueue.add(tempQueue.remove());
        }
    }
}
