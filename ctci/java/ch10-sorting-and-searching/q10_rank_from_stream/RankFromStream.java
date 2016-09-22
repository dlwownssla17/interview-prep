package q10_rank_from_stream;

import java.util.HashMap;

/**
 * Created by jjlee on 9/22/16.
 */
public class RankFromStream {
    private RankNode root;
    private HashMap<Integer, Integer> rankMap;

    /* keep track of rank of stream using a binary search tree involving nodes with additional information and
       a hashmap from int to its most up-to-date rank */
    public RankFromStream() {
        rankMap = new HashMap<>();
    }

    public void track(int x) {
        RankNode newNode;
        if (root == null) {
            newNode = new RankNode(x);
            root = newNode;
        } else {
            RankNode current = root;
            int rank = 0;
            while (true) {
                current.incrSize();
                if (current.getData() <= x) {
                    int addRank = (current.left != null ? current.left.getSize() : 0) + 1;
                    if (current.getData() == x) addRank += current.getRank();
                    rank += addRank;
                    if (current.right == null) {
                        newNode = new RankNode(x);
                        newNode.setRank(rank);
                        current.right = newNode;
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    if (current.left == null) {
                        newNode = new RankNode(x);
                        newNode.setRank(rank);
                        current.left = newNode;
                        break;
                    } else {
                        current = current.left;
                    }
                }
            }
        }
        rankMap.put(x, newNode.getRank());
    }

    public int getRankOfNumber(int x) {
        return rankMap.containsKey(x) ? rankMap.get(x) : -1;
    }
}
