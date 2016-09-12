package q13_stack_of_boxes;

import java.util.Arrays;

/**
 * Created by jjlee on 9/11/16.
 */
public class QuestionB {
    /* compute the height the tallest possible stack given n boxes by comparing the choices of including and excluding
       each box and using memoization */
    public static int stackMaxHeightIncludeExclude(Box[] boxes) {
        Arrays.sort(boxes, new BoxComparator());
        int[] map = new int[boxes.length];
        return stackMaxHeightIncludeExcludeHelper(boxes, 0, -1, map);
    }

    private static int stackMaxHeightIncludeExcludeHelper(Box[] boxes, int index, int topmost, int[] map) {
        if (index == boxes.length) return 0;
        int includeThisBox = 0;
        if (topmost == -1 || boxes[topmost].compareTo(boxes[index]) == 1) {
            if (map[index] == 0) map[index] = boxes[index].getHeight() + stackMaxHeightIncludeExcludeHelper(boxes, index + 1, index, map);
            includeThisBox = map[index];
        }
        int excludeThisBox = stackMaxHeightIncludeExcludeHelper(boxes, index + 1, topmost, map);
        return Math.max(includeThisBox, excludeThisBox);
    }
}
