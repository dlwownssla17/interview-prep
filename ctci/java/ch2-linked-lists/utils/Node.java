package utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 7/23/16.
 */
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
    }

    public T[] toArray() {
        List<T> l = new LinkedList<>();
        Node<T> current = this;
        while (current != null) {
            l.add(current.data);
            current = current.next;
        }
        return l.toArray((T[]) new Object[l.size()]);
    }
}
