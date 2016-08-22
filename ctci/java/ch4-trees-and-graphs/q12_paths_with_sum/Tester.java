package q12_paths_with_sum;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNode;

import static org.testng.Assert.*;
import static q12_paths_with_sum.QuestionA.*;
import static q12_paths_with_sum.QuestionB.*;

/**
 * Created by jjlee on 8/21/16.
 */
public class Tester {
    BinaryTreeNode<Integer> a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19,
            a20, a21, b0, b1, b2, b3, b4, b5, b6;

    @BeforeMethod
    public void setup() throws Exception {
        a0 = new BinaryTreeNode<>(3);
        a1 = new BinaryTreeNode<>(0);
        a2 = new BinaryTreeNode<>(4);
        a3 = new BinaryTreeNode<>(-1);
        a4 = new BinaryTreeNode<>(0);
        a5 = new BinaryTreeNode<>(-2);
        a6 = new BinaryTreeNode<>(3);
        a7 = new BinaryTreeNode<>(4);
        a8 = new BinaryTreeNode<>(1);
        a9 = new BinaryTreeNode<>(6);
        a10 = new BinaryTreeNode<>(2);
        a11 = new BinaryTreeNode<>(3);
        a12 = new BinaryTreeNode<>(1);
        a13 = new BinaryTreeNode<>(2);
        a14 = new BinaryTreeNode<>(1);
        a15 = new BinaryTreeNode<>(0);
        a16 = new BinaryTreeNode<>(1);
        a17 = new BinaryTreeNode<>(-3);
        a18 = new BinaryTreeNode<>(2);
        a19 = new BinaryTreeNode<>(3);
        a20 = new BinaryTreeNode<>(6);
        a21 = new BinaryTreeNode<>(6);
        a0.left = a1;
        a0.right = a2;
        a1.left = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;
        a4.left = a8;
        a5.left = a9;
        a5.right = a10;
        a6.left = a11;
        a7.left = a12;
        a7.right = a13;
        a10.right = a14;
        a11.right = a15;
        a12.right = a16;
        a13.right = a17;
        a15.left = a18;
        a16.left = a19;
        a16.right = a20;
        a17.right = a21;

        b0 = new BinaryTreeNode<>(0);
        b1 = new BinaryTreeNode<>(0);
        b2 = new BinaryTreeNode<>(0);
        b3 = new BinaryTreeNode<>(0);
        b4 = new BinaryTreeNode<>(0);
        b5 = new BinaryTreeNode<>(0);
        b6 = new BinaryTreeNode<>(0);
        b0.left = b1;
        b0.right = b2;
        b1.left = b3;
        b1.right = b4;
        b2.left = b5;
        b2.right = b6;
    }

    @Test
    public void testCountPathsWithSum() throws Exception {
        assertEquals(countPathsWithSum(a0, 5), 17);
        assertEquals(countPathsWithSum(b0, 0), 17);
    }

    @Test
    public void testCountPathsWithSumWithHashMap() throws Exception {
        assertEquals(countPathsWithSumWithHashMap(a0, 5), 17);
        assertEquals(countPathsWithSumWithHashMap(b0, 0), 17);
    }

}