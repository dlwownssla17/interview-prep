package q3_list_of_depths;

import utils.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jjlee on 8/17/16.
 */
public class QuestionB {
    /* create linked lists of all the nodes at each depth using BFS */
    public static <T> ArrayList<List<BinaryTreeNode<T>>> createLevelLinkedListsBFS(BinaryTreeNode<T> n) {
        ArrayList<List<BinaryTreeNode<T>>> levels = new ArrayList<>();
        if (n != null) {
            List<BinaryTreeNode<T>> currentLevel = new LinkedList<>();
            currentLevel.add(n);
            while (!currentLevel.isEmpty()) {
                levels.add(currentLevel);
                List<BinaryTreeNode<T>> previousLevel = currentLevel;
                currentLevel = new LinkedList<>();
                for (BinaryTreeNode<T> parent : previousLevel) {
                    if (parent.left != null) currentLevel.add(parent.left);
                    if (parent.right != null) currentLevel.add(parent.right);
                }
            }
        }
        return levels;
    }
}
