package q3_stack_of_plates;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by jjlee on 8/16/16.
 */
/* SetOfStacks using ArrayList of custom stacks with access to top and bottom nodes */
public class SetOfStacks<T> {
    private ArrayList<Stack<T>> setOfStacks;
    private int capacity;

    public SetOfStacks(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException();
        setOfStacks = new ArrayList<>();
        this.capacity = capacity;
    }

    public void push(T data) {
        if (setOfStacks.isEmpty() || setOfStacks.get(lastIndex()).getCapacity() == capacity) setOfStacks.add(new Stack<>());
        setOfStacks.get(lastIndex()).push(data);
    }

    public T pop() {
        if (setOfStacks.isEmpty()) throw new EmptyStackException();
        T data = setOfStacks.get(lastIndex()).pop();
        checkLastStackEmpty();
        return data;
    }

    public T popAt(int index) {
        if (setOfStacks.size() <= index) throw new IndexOutOfBoundsException();
        T data = setOfStacks.get(index).pop();
        for (int i = index; i < lastIndex(); i++) {
            T shiftedData = setOfStacks.get(i + 1).popBottom();
            setOfStacks.get(i).push(shiftedData);
        }
        checkLastStackEmpty();
        return data;
    }

    private void checkLastStackEmpty() {
        if (setOfStacks.get(lastIndex()).getCapacity() == 0) setOfStacks.remove(lastIndex());
    }

    private int lastIndex() {
        return setOfStacks.size() - 1;
    }
}
