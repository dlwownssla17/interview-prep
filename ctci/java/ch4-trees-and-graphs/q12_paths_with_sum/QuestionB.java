package q12_paths_with_sum;

import utils.BinaryTreeNode;

import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * Created by jjlee on 8/21/16.
 */
public class QuestionB {
    /* improved way to count paths with sum by keeping track of running sums from root for each node
       (O(N) time, O(N) space) */
    public static int countPathsWithSumWithHashMap(BinaryTreeNode<Integer> root, int sum) {
        HashMap<Integer, Integer> runningSumsCount = new HashMap<>();
        return countPathsWithSumWithHashMapHelper(root, sum, 0, runningSumsCount);
    }

    private static int countPathsWithSumWithHashMapHelper(BinaryTreeNode<Integer> n, int sum, int runningSum,
                                                          HashMap<Integer, Integer> runningSumsCount) {
        if (n == null) return 0;
        int count = 0;
        int newRunningSum = runningSum + n.data;
        if (newRunningSum == sum) count++;
        int runningSumFromPotentialNode = newRunningSum - sum;
        if (runningSumsCount.containsKey(runningSumFromPotentialNode)) count += runningSumsCount.get(runningSumFromPotentialNode);
        incrementRunningSumCount(runningSumsCount, newRunningSum);
        count += countPathsWithSumWithHashMapHelper(n.left, sum, newRunningSum, runningSumsCount) +
                countPathsWithSumWithHashMapHelper(n.right, sum, newRunningSum, runningSumsCount);
        decrementRunningSumCount(runningSumsCount, newRunningSum);
        return count;
    }

    private static void incrementRunningSumCount(HashMap<Integer, Integer> runningSumsCount, int runningSum) {
        if (!runningSumsCount.containsKey(runningSum)) runningSumsCount.put(runningSum, 1);
        else runningSumsCount.put(runningSum, runningSumsCount.get(runningSum) + 1);
    }

    private static void decrementRunningSumCount(HashMap<Integer, Integer> runningSumsCount, int runningSum) {
        if (!runningSumsCount.containsKey(runningSum)) throw new NoSuchElementException();
        int decr = runningSumsCount.get(runningSum) - 1;
        if (decr == 0) runningSumsCount.remove(runningSum);
        else runningSumsCount.put(runningSum, decr);
    }
}
