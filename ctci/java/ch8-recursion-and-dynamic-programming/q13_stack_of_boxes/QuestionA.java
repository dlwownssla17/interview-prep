package q13_stack_of_boxes;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by jjlee on 9/11/16.
 */
public class QuestionA {
    /* compute the height the tallest possible stack given n boxes by using subproblems and memoization */
    public static int stackMaxHeight(Box[] boxes) {
        Arrays.sort(boxes, new BoxComparator());
        int[] map = new int[boxes.length];
        return stackMaxHeightHelper(boxes, -1, map);
    }

    private static int stackMaxHeightHelper(Box[] boxes, int index, int[] map) {
        int thisMax = 0;
        for (int i = index + 1; i < boxes.length; i++) {
            if (index == -1 || boxes[index].compareTo(boxes[i]) == 1) {
                int max = map[i] > 0 ? map[i] : stackMaxHeightHelper(boxes, i, map);
                thisMax = Math.max(thisMax, max);
            }
        }
        int thisHeight = thisMax + (index != -1 ? boxes[index].getHeight() : 0);
        if (index != -1) map[index] = thisHeight;
        return thisHeight;
    }
}
