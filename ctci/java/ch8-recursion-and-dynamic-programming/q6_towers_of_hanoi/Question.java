package q6_towers_of_hanoi;

/**
 * Created by jjlee on 8/28/16.
 */
public class Question {
    /* solve towers of hanoi recursively, using the solution for N - 1 as intermediary */
    public static <T> void moveDisks(Tower<T> towerFirst, Tower<T> towerMid, Tower<T> towerLast) {
        moveNthDisk(towerFirst, towerMid, towerLast, towerFirst.size());
    }

    private static <T> void moveNthDisk(Tower<T> towerFirst, Tower<T> towerMid, Tower<T> towerLast, int N) {
        if (N <= 0) return;
        moveNthDisk(towerFirst, towerLast, towerMid, N - 1);
        T data = towerFirst.pop();
        System.out.println("Moving item " + data.toString() + " from " + towerFirst.getName() + " to " +
                towerLast.getName() + ".");
        towerLast.push(data);
        moveNthDisk(towerMid, towerFirst, towerLast, N - 1);
    }
}
