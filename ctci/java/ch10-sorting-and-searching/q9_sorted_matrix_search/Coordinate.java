package q9_sorted_matrix_search;

/**
 * Created by jjlee on 9/21/16.
 */
public class Coordinate {
    private int r;
    private int c;

    public Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Coordinate)) return false;
        return this.r == ((Coordinate) other).r && this.c == ((Coordinate) other).c;
    }
}
