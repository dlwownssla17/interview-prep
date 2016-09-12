package q13_stack_of_boxes;

/**
 * Created by jjlee on 9/11/16.
 */
public class Box implements Comparable<Box> {
    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int compareTo(Box other) {
        if (getWidth() < other.getWidth() && getHeight() < other.getHeight() && getDepth() < other.getDepth()) return -1;
        else if (getWidth() > other.getWidth() && getHeight() > other.getHeight() && getDepth() > other.getDepth()) return 1;
        else return 0;
    }


    public boolean equals(Object other) {
        if (!(other instanceof Box)) return false;
        Box box = (Box) other;
        return getWidth() == box.getWidth() && getHeight() == box.getHeight() && getDepth() == box.getDepth();
    }
}
