package q4_power_set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;
import static q4_power_set.QuestionA.*;
import static q4_power_set.QuestionB.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    ArrayList<Integer> a, b, c, d, e;

    @BeforeMethod
    public void setup() throws Exception {
        a = new ArrayList<>();
        b = new ArrayList<>();
        c = new ArrayList<>();
        d = new ArrayList<>();
        e = new ArrayList<>();
        b.add(0);
        c.add(0);
        c.add(1);
        d.add(-5);
        d.add(-1);
        d.add(3);
        d.add(7);
        e.add(7);
        e.add(-1);
        e.add(3);
        e.add(-5);
    }

    @Test
    public void testPowerSet() throws Exception {
        ArrayList<ArrayList<Integer>> powerSetA = powerSet(a);
        assertTrue(powerSetA.isEmpty());
        printPowerSet(powerSetA);
        System.out.println("---");

        ArrayList<ArrayList<Integer>> powerSetB = powerSet(b);
        assertEquals(powerSetB.size(), 2);
        printPowerSet(powerSetB);
        System.out.println("---");

        ArrayList<ArrayList<Integer>> powerSetC = powerSet(c);
        assertEquals(powerSetC.size(), 4);
        printPowerSet(powerSetC);
        System.out.println("---");

        ArrayList<ArrayList<Integer>> powerSetD = powerSet(d);
        assertEquals(powerSetD.size(), 16);
        printPowerSet(powerSetD);
        System.out.println("---");

        ArrayList<ArrayList<Integer>> powerSetE = powerSet(e);
        assertEquals(powerSetE.size(), 16);
        printPowerSet(powerSetE);
        System.out.println("---");
    }

    @Test
    public void testPowerSetIncludeExclude() throws Exception {
        ArrayList<ArrayList<Integer>> powerSetA = powerSetIncludeExclude(a);
        assertTrue(powerSetA.isEmpty());
        printPowerSet(powerSetA);
        System.out.println("---");

        ArrayList<ArrayList<Integer>> powerSetB = powerSetIncludeExclude(b);
        assertEquals(powerSetB.size(), 2);
        printPowerSet(powerSetB);
        System.out.println("---");

        ArrayList<ArrayList<Integer>> powerSetC = powerSetIncludeExclude(c);
        assertEquals(powerSetC.size(), 4);
        printPowerSet(powerSetC);
        System.out.println("---");

        ArrayList<ArrayList<Integer>> powerSetD = powerSetIncludeExclude(d);
        assertEquals(powerSetD.size(), 16);
        printPowerSet(powerSetD);
        System.out.println("---");

        ArrayList<ArrayList<Integer>> powerSetE = powerSetIncludeExclude(e);
        assertEquals(powerSetE.size(), 16);
        printPowerSet(powerSetE);
        System.out.println("---");
    }

    private static <T> void printPowerSet(ArrayList<ArrayList<T>> powerSet) {
        for (ArrayList<T> subset : powerSet) {
            for (T item : subset) {
                System.out.print(item.toString() + " ");
            }
            System.out.println();
        }
    }

}