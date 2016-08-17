package min_heap;

/**
 * Created by jjlee on 8/16/16.
 */
public class MinHeapNode<T extends Comparable<? super T>> {
    public T data;
    public MinHeapNode<T> parent;
    public MinHeapNode<T> left;
    public MinHeapNode<T> right;

    public MinHeapNode(T data) {
        this.data = data;
    }
}
