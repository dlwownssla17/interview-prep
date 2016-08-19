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
            Queue<BinaryTreeNode<T>> q = new LinkedList<>();
            Queue<Integer> levelQueue = new LinkedList<>();
            q.add(n);
            levelQueue.add(0);
            while (!q.isEmpty() && !levelQueue.isEmpty()) {
                BinaryTreeNode<T> current = q.remove();
                int currentLevel = levelQueue.remove();
                if (levels.size() <= currentLevel) levels.add(new LinkedList<>());
                levels.get(currentLevel).add(current);
                if (current.left != null) {
                    q.add(current.left);
                    levelQueue.add(currentLevel + 1);
                }
                if (current.right != null) {
                    q.add(current.right);
                    levelQueue.add(currentLevel + 1);
                }
            }
        }
        return levels;
    }
}
