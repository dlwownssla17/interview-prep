package min_heap;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by jjlee on 8/16/16.
 */
public class MinHeap<T extends Comparable<? super T>> {
    private MinHeapNode<T> min;
    private ArrayList<ArrayList<MinHeapNode<T>>> levels;
    private int levelCapacity;
    private int size;

    public MinHeap() {
        min = null;
        levels = new ArrayList<>();
        levelCapacity = 1;
        size = 0;
    }

    public void insert(T data) {
        MinHeapNode<T> newNode = new MinHeapNode<>(data);
        insertAtLast(newNode);
        heapify(newNode);
    }

    public T extractMin() {
        if (isEmpty()) throw new NoSuchElementException();
        T data = min.data;
        removeTop();
        if (min != null) sink(min);
        return data;
    }

    public T peekMin() {
        if (isEmpty()) throw new NoSuchElementException();
        return min.data;
    }

    public boolean isEmpty() {
        return min == null;
    }

    public int size() {
        return size;
    }

    private void insertAtLast(MinHeapNode<T> newNode) {
        if (isEmpty()) {
            levels.add(new ArrayList<>());
            levels.get(0).add(newNode);
            min = newNode;
        } else {
            if (levels.get(levelLastIndex()).size() == levelCapacity) {
                levels.add(new ArrayList<>());
                levelCapacity *= 2;
            }
            ArrayList<MinHeapNode<T>> lastLevel = levels.get(levelLastIndex());
            lastLevel.add(newNode);
            MinHeapNode<T> parentNode = levels.get(levelLastIndex() - 1).get((lastLevel.size() - 1) / 2);
            newNode.parent = parentNode;
            if (parentNode.left == null) parentNode.left = newNode;
            else parentNode.right = newNode;
        }
        size++;
    }

    private void removeTop() {
        if (size == 1) {
            levels.remove(0);
            min = null;
        } else {
            ArrayList<MinHeapNode<T>> lastLevel = levels.get(levelLastIndex());
            MinHeapNode<T> lastNode = lastLevel.get(lastLevel.size() - 1);
            swap(min, lastNode);
            if (lastNode.parent.left == lastNode) lastNode.parent.left = null;
            else lastNode.parent.right = null;
            lastLevel.remove(lastLevel.size() - 1);
            if (lastLevel.isEmpty()) {
                levels.remove(levelLastIndex());
                levelCapacity /= 2;
            }
        }
        size--;
    }

    private int levelLastIndex() {
        return levels.size() - 1;
    }

    private void heapify(MinHeapNode<T> n) {
        if (n.parent != null && n.data.compareTo(n.parent.data) == -1) {
            swap(n, n.parent);
            heapify(n.parent);
        }
    }

    private void sink(MinHeapNode<T> n) {
        boolean noChild = n.left == null && n.right == null;
        boolean twoChildren = n.left != null && n.right != null;
        MinHeapNode<T> child = noChild ? null :
                (twoChildren && n.left.data.compareTo(n.right.data) == -1) || n.right == null ? setSwapLeft(n) : setSwapRight(n);
        if (child != null) {
            swap(n, child);
            sink(child);
        }
    }

    private MinHeapNode<T> setSwapLeft(MinHeapNode<T> n) {
        return n.left.data.compareTo(n.data) == -1 ? n.left : null;
    }

    private MinHeapNode<T> setSwapRight(MinHeapNode<T> n) {
        return n.right.data.compareTo(n.data) == -1 ? n.right : null;
    }

    private void swap(MinHeapNode<T> n1, MinHeapNode<T> n2) {
        T temp = n1.data;
        n1.data = n2.data;
        n2.data = temp;
    }
}
