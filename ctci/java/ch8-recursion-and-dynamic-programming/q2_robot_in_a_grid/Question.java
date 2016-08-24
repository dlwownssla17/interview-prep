package q2_robot_in_a_grid;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 8/23/16.
 */
public class Question {
    /* find a path for the robot from top left to bottom right using graph approach (slightly different from solution's
       dynamic programming approach, although the underlying principle is the same) */
    public static List<Point> findPath(boolean[][] grid) {
        List<Point> path = new LinkedList<>();
        if (grid.length > 0 && grid[0].length > 0) getPath(grid, 0, 0, path);
        return path;
    }

    private static boolean getPath(boolean[][] grid, int i, int j, List<Point> path) {
        if (!grid[i][j]) return false;
        grid[i][j] = false;
        if (i == grid.length - 1 && j == grid[i].length - 1) {
            path.add(0, new Point(i, j));
            return true;
        }
        if (j + 1 < grid[i].length && grid[i][j + 1]) {
            if (getPath(grid, i, j + 1, path)) {
                path.add(0, new Point(i, j));
                return true;
            }
        }
        if (i + 1 < grid.length && grid[i + 1][j]) {
            if (getPath(grid, i + 1, j, path)) {
                path.add(0, new Point(i, j));
                return true;
            }
        }
        return false;
    }
}
