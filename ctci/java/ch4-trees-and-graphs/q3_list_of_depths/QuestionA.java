package q3_list_of_depths;

import utils.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 8/17/16.
 */
public class QuestionA {
    /* create linked lists of all the nodes at each depth using DFS */
    public static <T> ArrayList<List<BinaryTreeNode<T>>> createLevelLinkedListsDFS(BinaryTreeNode<T> n) {
        ArrayList<List<BinaryTreeNode<T>>> levels = new ArrayList<>();
        populateLevelLinkedListsDFS(n, levels, 0);
        return levels;
    }

    /* recursive helper function that populates the linked lists with given level index */
    private static <T> void populateLevelLinkedListsDFS(BinaryTreeNode<T> n, ArrayList<List<BinaryTreeNode<T>>> levels, int level) {
        if (n == null) return;
        if (levels.size() <= level) levels.add(new LinkedList<>());
        levels.get(level++).add(n);
        populateLevelLinkedListsDFS(n.left, levels, level);
        populateLevelLinkedListsDFS(n.right, levels, level);
    }
}
