package q10_rank_from_stream;

/**
 * Created by jjlee on 9/22/16.
 */
public class RankNode {
    private int data;
    private int rank;
    private int size;
    RankNode left;
    RankNode right;

    public RankNode(int n) {
        this.data = n;
        this.rank = 0;
        this.size = 1;
    }

    public int getData() {
        return data;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSize() {
        return size;
    }

    public void incrSize() {
        size++;
    }
}
