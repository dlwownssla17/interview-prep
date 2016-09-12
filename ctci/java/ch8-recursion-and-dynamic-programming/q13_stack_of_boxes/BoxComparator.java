package q13_stack_of_boxes;

import java.util.Comparator;

/**
 * Created by jjlee on 9/11/16.
 */
public class BoxComparator implements Comparator<Box> {
    @Override
    public int compare(Box box1, Box box2) {
        return box2.getHeight() - box1.getHeight();
    }
}
