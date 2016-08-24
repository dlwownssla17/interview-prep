package q2_robot_in_a_grid;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;
import static q2_robot_in_a_grid.Question.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    static boolean[][] grid0, grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9, grid10;
    static List<Point> path0, path1, path2, path3, path4, path5, path6, path7, path8, path9, path10;

    @BeforeMethod
    public static void setup() throws Exception {
        grid0 = new boolean[][]{{ }};
        grid1 = new boolean[][]{{ false }};
        grid2 = new boolean[][]{{ false, true }, { true, true }};
        grid3 = new boolean[][]{{ true, true }, { true, false }};
        grid4 = new boolean[][]{{ true, false }, { true, true }};
        grid5 = new boolean[][]{{ true, true }, { true, true }};
        grid6 = new boolean[][]{{ true, false }, { false, true }};
        grid7 = new boolean[][]{{ true, true, true, false, false },
                                { true, false, true, true, false },
                                { true, true, false, false, true },
                                { false, true, true, true, false },
                                { true, true, false, true, true }};
        grid8 = new boolean[][]{{ true, true, true, false, false },
                                { true, false, true, true, false },
                                { true, true, false, true, true },
                                { false, true, true, true, false },
                                { true, true, false, true, true }};
        grid9 = new boolean[][]{{ true, true, true, false, false },
                                { true, false, true, true, false },
                                { true, true, false, true, true },
                                { false, true, true, true, false },
                                { true, true, false, false, true }};
        grid10 = new boolean[][]{{ true, true, true, true, true },
                                 { true, true, true, true, true },
                                 { true, true, true, true, true },
                                 { true, false, false, false, false },
                                 { true, true, true, true, true }};
        path0 = path1 = path2 = path3 = path6 = path9 = new LinkedList<>();
        path4 = generatePath(new int[][]{{ 0, 0 }, { 1, 0 }, { 1, 1 }});
        path5 = generatePath(new int[][]{{ 0, 0 }, { 0, 1 }, { 1, 1 }});
        path7 = generatePath(new int[][]{{ 0, 0 }, { 1, 0 }, { 2, 0 }, { 2, 1 }, { 3, 1 }, { 3, 2 }, { 3, 3 }, { 4, 3 }, { 4, 4 }});
        path8 = generatePath(new int[][]{{ 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 2 }, { 1, 3 }, { 2, 3 }, { 3, 3 }, { 4, 3 }, { 4, 4 }});
        path10 = generatePath(new int[][]{{ 0, 0 }, { 1, 0 }, { 2, 0 }, { 3, 0 }, { 4, 0 }, { 4, 1 }, { 4, 2 }, { 4, 3 }, { 4, 4 }});
    }

    @Test
    public void testFindPath() throws Exception {
        assertEquals(findPath(grid0), path0);
        assertEquals(findPath(grid1), path1);
        assertEquals(findPath(grid2), path2);
        assertEquals(findPath(grid3), path3);
        assertEquals(findPath(grid4), path4);
        assertEquals(findPath(grid5), path5);
        assertEquals(findPath(grid6), path6);
        assertEquals(findPath(grid7), path7);
        assertEquals(findPath(grid8), path8);
        assertEquals(findPath(grid9), path9);
        assertEquals(findPath(grid10), path10);
    }

    private static List<Point> generatePath(int[][] coordinates) {
        List<Point> path = new LinkedList<>();
        for (int[] coordinate : coordinates) {
            path.add(new Point(coordinate[0], coordinate[1]));
        }
        return path;
    }

}