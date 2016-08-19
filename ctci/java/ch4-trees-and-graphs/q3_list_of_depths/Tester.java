package q3_list_of_depths;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BinaryTreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;
import static q3_list_of_depths.QuestionA.*;
import static q3_list_of_depths.QuestionB.*;

/**
 * Created by jjlee on 8/17/16.
 */
public class Tester {
    BinaryTreeNode<Integer> a0, b0, b1, c0, c1, c2, d0, d1, d2, d3, d4, d5, d6, d7, e0, e1, e2, e3, e4, e5, e6, e7,
            f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, g0, g1, g2, g3, g4, g5, g6, g7;

    @BeforeMethod
    public void setup() throws Exception {
        a0 = new BinaryTreeNode<>(0);
        b0 = new BinaryTreeNode<>(0);
        b1 = new BinaryTreeNode<>(1);
        b0.left = b1;
        c0 = new BinaryTreeNode<>(0);
        c1 = new BinaryTreeNode<>(1);
        c2 = new BinaryTreeNode<>(2);
        c0.left = c1;
        c0.right = c2;
        d0 = new BinaryTreeNode<>(0);
        d1 = new BinaryTreeNode<>(1);
        d2 = new BinaryTreeNode<>(2);
        d3 = new BinaryTreeNode<>(3);
        d4 = new BinaryTreeNode<>(4);
        d5 = new BinaryTreeNode<>(5);
        d6 = new BinaryTreeNode<>(6);
        d7 = new BinaryTreeNode<>(7);
        d0.left = d1;
        d0.right = d2;
        d1.left = d3;
        d2.left = d4;
        d3.left = d5;
        d3.right = d6;
        d5.left = d7;
        e0 = new BinaryTreeNode<>(0);
        e1 = new BinaryTreeNode<>(1);
        e2 = new BinaryTreeNode<>(2);
        e3 = new BinaryTreeNode<>(3);
        e4 = new BinaryTreeNode<>(4);
        e5 = new BinaryTreeNode<>(5);
        e6 = new BinaryTreeNode<>(6);
        e7 = new BinaryTreeNode<>(7);
        e0.right = e1;
        e1.left = e2;
        e1.right = e3;
        e2.right = e4;
        e3.right = e5;
        e4.left = e6;
        e4.right = e7;
        f0 = new BinaryTreeNode<>(0);
        f1 = new BinaryTreeNode<>(1);
        f2 = new BinaryTreeNode<>(2);
        f3 = new BinaryTreeNode<>(3);
        f4 = new BinaryTreeNode<>(4);
        f5 = new BinaryTreeNode<>(5);
        f6 = new BinaryTreeNode<>(6);
        f7 = new BinaryTreeNode<>(7);
        f8 = new BinaryTreeNode<>(8);
        f9 = new BinaryTreeNode<>(9);
        f10 = new BinaryTreeNode<>(10);
        f11 = new BinaryTreeNode<>(11);
        f12 = new BinaryTreeNode<>(12);
        f13 = new BinaryTreeNode<>(13);
        f14 = new BinaryTreeNode<>(14);
        f0.left = f1;
        f0.right = f2;
        f1.left = f3;
        f1.right = f4;
        f2.left = f5;
        f2.right = f6;
        f3.left = f7;
        f3.right = f8;
        f4.left = f9;
        f4.right = f10;
        f5.left = f11;
        f5.right = f12;
        f6.left = f13;
        f6.right = f14;
        g0 = new BinaryTreeNode<>(0);
        g1 = new BinaryTreeNode<>(1);
        g2 = new BinaryTreeNode<>(2);
        g3 = new BinaryTreeNode<>(3);
        g4 = new BinaryTreeNode<>(4);
        g5 = new BinaryTreeNode<>(5);
        g6 = new BinaryTreeNode<>(6);
        g7 = new BinaryTreeNode<>(7);
        g0.left = g1;
        g1.left = g2;
        g2.left = g3;
        g3.left = g4;
        g4.left = g5;
        g5.left = g6;
        g6.left = g7;
    }

    @Test
    public void testCreateLevelLinkedListsDFS() throws Exception {
        ArrayList<List<BinaryTreeNode<Integer>>> noLevels = createLevelLinkedListsDFS(null);
        assertTrue(noLevels.isEmpty());

        ArrayList<List<BinaryTreeNode<Integer>>> aLevels = createLevelLinkedListsDFS(a0);
        assertEquals(aLevels.size(), 1);
        assertEquals(aLevels.get(0).size(), 1);

        ArrayList<List<BinaryTreeNode<Integer>>> bLevels = createLevelLinkedListsDFS(b0);
        assertEquals(bLevels.size(), 2);
        assertEquals(bLevels.get(0).size(), 1);
        assertEquals(bLevels.get(1).size(), 1);

        ArrayList<List<BinaryTreeNode<Integer>>> cLevels = createLevelLinkedListsDFS(c0);
        assertEquals(cLevels.size(), 2);
        assertEquals(cLevels.get(0).size(), 1);
        assertEquals(cLevels.get(1).size(), 2);

        ArrayList<List<BinaryTreeNode<Integer>>> dLevels = createLevelLinkedListsDFS(d0);
        assertEquals(dLevels.size(), 5);
        assertEquals(dLevels.get(0).size(), 1);
        assertEquals(dLevels.get(1).size(), 2);
        assertEquals(dLevels.get(2).size(), 2);
        assertEquals(dLevels.get(3).size(), 2);
        assertEquals(dLevels.get(4).size(), 1);

        ArrayList<List<BinaryTreeNode<Integer>>> eLevels = createLevelLinkedListsDFS(e0);
        assertEquals(eLevels.size(), 5);
        assertEquals(eLevels.get(0).size(), 1);
        assertEquals(eLevels.get(1).size(), 1);
        assertEquals(eLevels.get(2).size(), 2);
        assertEquals(eLevels.get(3).size(), 2);
        assertEquals(eLevels.get(4).size(), 2);

        ArrayList<List<BinaryTreeNode<Integer>>> fLevels = createLevelLinkedListsDFS(f0);
        assertEquals(fLevels.size(), 4);
        assertEquals(fLevels.get(0).size(), 1);
        assertEquals(fLevels.get(1).size(), 2);
        assertEquals(fLevels.get(2).size(), 4);
        assertEquals(fLevels.get(3).size(), 8);

        ArrayList<List<BinaryTreeNode<Integer>>> gLevels = createLevelLinkedListsDFS(g0);
        assertEquals(gLevels.size(), 8);
        assertEquals(gLevels.get(0).size(), 1);
        assertEquals(gLevels.get(1).size(), 1);
        assertEquals(gLevels.get(2).size(), 1);
        assertEquals(gLevels.get(3).size(), 1);
        assertEquals(gLevels.get(4).size(), 1);
        assertEquals(gLevels.get(5).size(), 1);
        assertEquals(gLevels.get(6).size(), 1);
        assertEquals(gLevels.get(7).size(), 1);
    }

    @Test
    public void testCreateLevelLinkedListsBFS() throws Exception {
        ArrayList<List<BinaryTreeNode<Integer>>> noLevels = createLevelLinkedListsBFS(null);
        assertTrue(noLevels.isEmpty());

        ArrayList<List<BinaryTreeNode<Integer>>> aLevels = createLevelLinkedListsBFS(a0);
        assertEquals(aLevels.size(), 1);
        assertEquals(aLevels.get(0).size(), 1);

        ArrayList<List<BinaryTreeNode<Integer>>> bLevels = createLevelLinkedListsBFS(b0);
        assertEquals(bLevels.size(), 2);
        assertEquals(bLevels.get(0).size(), 1);
        assertEquals(bLevels.get(1).size(), 1);

        ArrayList<List<BinaryTreeNode<Integer>>> cLevels = createLevelLinkedListsBFS(c0);
        assertEquals(cLevels.size(), 2);
        assertEquals(cLevels.get(0).size(), 1);
        assertEquals(cLevels.get(1).size(), 2);

        ArrayList<List<BinaryTreeNode<Integer>>> dLevels = createLevelLinkedListsBFS(d0);
        assertEquals(dLevels.size(), 5);
        assertEquals(dLevels.get(0).size(), 1);
        assertEquals(dLevels.get(1).size(), 2);
        assertEquals(dLevels.get(2).size(), 2);
        assertEquals(dLevels.get(3).size(), 2);
        assertEquals(dLevels.get(4).size(), 1);

        ArrayList<List<BinaryTreeNode<Integer>>> eLevels = createLevelLinkedListsBFS(e0);
        assertEquals(eLevels.size(), 5);
        assertEquals(eLevels.get(0).size(), 1);
        assertEquals(eLevels.get(1).size(), 1);
        assertEquals(eLevels.get(2).size(), 2);
        assertEquals(eLevels.get(3).size(), 2);
        assertEquals(eLevels.get(4).size(), 2);

        ArrayList<List<BinaryTreeNode<Integer>>> fLevels = createLevelLinkedListsBFS(f0);
        assertEquals(fLevels.size(), 4);
        assertEquals(fLevels.get(0).size(), 1);
        assertEquals(fLevels.get(1).size(), 2);
        assertEquals(fLevels.get(2).size(), 4);
        assertEquals(fLevels.get(3).size(), 8);

        ArrayList<List<BinaryTreeNode<Integer>>> gLevels = createLevelLinkedListsBFS(g0);
        assertEquals(gLevels.size(), 8);
        assertEquals(gLevels.get(0).size(), 1);
        assertEquals(gLevels.get(1).size(), 1);
        assertEquals(gLevels.get(2).size(), 1);
        assertEquals(gLevels.get(3).size(), 1);
        assertEquals(gLevels.get(4).size(), 1);
        assertEquals(gLevels.get(5).size(), 1);
        assertEquals(gLevels.get(6).size(), 1);
        assertEquals(gLevels.get(7).size(), 1);
    }

}