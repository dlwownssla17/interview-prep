package q9_bst_sequences;

import utils.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jjlee on 8/20/16.
 */
public class Question {

    public static <T extends Comparable<? super T>> ArrayList<LinkedList<T>> allBSTSequences(BinaryTreeNode<T> root) {
        if (root == null) return new ArrayList<>();
        return allBSTSequencesHelper(root);
    }

    private static <T extends Comparable<? super T>> ArrayList<LinkedList<T>> allBSTSequencesHelper(BinaryTreeNode<T> root) {
        if (root == null) {
            ArrayList<LinkedList<T>> sequences = new ArrayList<>();
            sequences.add(new LinkedList<>());
            return sequences;
        }
        ArrayList<LinkedList<T>> sequencesLeft = allBSTSequencesHelper(root.left);
        ArrayList<LinkedList<T>> sequencesRight = allBSTSequencesHelper(root.right);
        ArrayList<LinkedList<T>> combinationSequences = weaveBSTSequences(sequencesLeft, sequencesRight);
        for (LinkedList<T> sequence : combinationSequences) {
            sequence.addFirst(root.data);
        }
        return combinationSequences;
    }

    private static <T extends Comparable<? super T>> ArrayList<LinkedList<T>> weaveBSTSequences(ArrayList<LinkedList<T>> sequences1,
                                                                       ArrayList<LinkedList<T>> sequences2) {
        ArrayList<LinkedList<T>> combinationSequences = new ArrayList<>();
        for (int i = 0; i < sequences1.size(); i++) {
            for (int j = 0; j <sequences2.size(); j++) {
                LinkedList<T> seq1 = sequences1.get(i);
                LinkedList<T> seq2 = sequences2.get(j);
                weaveBSTSequencesHelper(combinationSequences, seq1, seq2, new LinkedList<>());
            }
        }
        return combinationSequences;
    }

    private static <T extends Comparable<? super T>> void weaveBSTSequencesHelper(ArrayList<LinkedList<T>> sequences,
                                                                                  LinkedList<T> seq1, LinkedList<T> seq2,
                                                                                  LinkedList<T> buf) {
        if (seq1.isEmpty() || seq2.isEmpty()) {
            LinkedList<T> newSequence = new LinkedList<>();
            newSequence.addAll(buf);
            newSequence.addAll(seq1);
            newSequence.addAll(seq2);
            sequences.add(newSequence);
            return;
        }

        buf.add(seq1.remove());
        weaveBSTSequencesHelper(sequences, seq1, seq2, buf);
        seq1.addFirst(buf.removeLast());

        buf.add(seq2.remove());
        weaveBSTSequencesHelper(sequences, seq1, seq2, buf);
        seq2.addFirst(buf.removeLast());
    }
}
