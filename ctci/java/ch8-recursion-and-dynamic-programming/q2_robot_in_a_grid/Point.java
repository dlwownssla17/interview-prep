package q2_robot_in_a_grid;

/**
 * Created by jjlee on 8/23/16.
 */
public class Point {
    private int i;
    private int j;

    public Point(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Point)) return false;
        Point p = (Point) other;
        return this.i == p.i && this.j == p.j;
    }
}
