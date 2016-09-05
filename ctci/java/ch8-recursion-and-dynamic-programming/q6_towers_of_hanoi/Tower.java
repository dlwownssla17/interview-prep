package q6_towers_of_hanoi;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by jjlee on 8/28/16.
 */
public class Tower<T> {
    private Stack<T> tower;
    private String name;

    public Tower(String name) {
        this.name = name;
        tower = new Stack<>();
    }

    public void push(T data) {
        tower.push(data);
    }

    public T pop() {
        if (tower.isEmpty()) throw new EmptyStackException();
        return tower.pop();
    }

    public int size() {
        return tower.size();
    }

    public boolean isEmpty() {
        return tower.isEmpty();
    }

    public String getName() {
        return name;
    }
}
