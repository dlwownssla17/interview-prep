package q2_minimal_tree;

import org.testng.annotations.Test;
import utils.BinaryTreeNode;

import java.util.Arrays;

import static org.testng.Assert.*;
import static utils.BinaryTree.*;
import static q2_minimal_tree.Question.*;

/**
 * Created by jjlee on 8/17/16.
 */
public class Tester {
    @Test
    public void testToMinimalBST() throws Exception {
        int[] a = new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        int[] b = new int[]{ 0, 1, 2, 3, 4, 5 };
        int[] c = new int[]{ 0, 1 };
        int[] d = new int[]{ 0 };
        int[] e = new int[]{ };

        BinaryTreeNode<Integer> aBST = toMinimalBST(Arrays.stream(a).boxed().toArray( Integer[]::new ));
        assertEquals(getHeight(aBST), 4);
        BinaryTreeNode<Integer> bBST = toMinimalBST(Arrays.stream(b).boxed().toArray( Integer[]::new ));
        assertEquals(getHeight(bBST), 3);
        BinaryTreeNode<Integer> cBST = toMinimalBST(Arrays.stream(c).boxed().toArray( Integer[]::new ));
        assertEquals(getHeight(cBST), 2);
        BinaryTreeNode<Integer> dBST = toMinimalBST(Arrays.stream(d).boxed().toArray( Integer[]::new ));
        assertEquals(getHeight(dBST), 1);
        BinaryTreeNode<Integer> eBST = toMinimalBST(Arrays.stream(e).boxed().toArray( Integer[]::new ));
        assertEquals(getHeight(eBST), 0);
    }

}