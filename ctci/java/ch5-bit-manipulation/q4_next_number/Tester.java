package q4_next_number;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.Assert.*;
import static q4_next_number.QuestionA.*;
import static q4_next_number.QuestionB.*;

/**
 * Created by jjlee on 8/23/16.
 */
public class Tester {
    @Test
    public void testNextSmallest() throws Exception {
        assertEquals(nextSmallest(Integer.parseInt("1010", 2)), Integer.parseInt("1001", 2));
        assertEquals(nextSmallest(Integer.parseInt("111000", 2)), Integer.parseInt("110100", 2));
        assertEquals(nextSmallest(Integer.parseInt("1100001", 2)), Integer.parseInt("1011000", 2));
        assertEquals(nextSmallest(Integer.parseInt("101111", 2)), Integer.parseInt("011111", 2));
        try { nextSmallest(Integer.parseInt("0", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextSmallest(Integer.parseInt("1", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextSmallest(Integer.parseInt("11111", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextSmallest(Integer.parseInt("1111111111111111111111111111111", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
    }

    @Test
    public void testNextLargest() throws Exception {
        assertEquals(nextLargest(Integer.parseInt("1010", 2)), Integer.parseInt("1100", 2));
        assertEquals(nextLargest(Integer.parseInt("100001", 2)), Integer.parseInt("100010", 2));
        assertEquals(nextLargest(Integer.parseInt("111", 2)), Integer.parseInt("1011", 2));
        assertEquals(nextLargest(Integer.parseInt("10111100000", 2)), Integer.parseInt("11000000111", 2));
        try { nextLargest(Integer.parseInt("0", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextLargest(Integer.parseInt("1111000000000000000000000000000", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextLargest(Integer.parseInt("1000000000000000000000000000000", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextLargest(Integer.parseInt("1111111111111111111111111111111", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
    }

    @Test
    public void testNextSmallestArithmetic() throws Exception {
        assertEquals(nextSmallestArithmetic(Integer.parseInt("1010", 2)), Integer.parseInt("1001", 2));
        assertEquals(nextSmallestArithmetic(Integer.parseInt("111000", 2)), Integer.parseInt("110100", 2));
        assertEquals(nextSmallestArithmetic(Integer.parseInt("1100001", 2)), Integer.parseInt("1011000", 2));
        assertEquals(nextSmallestArithmetic(Integer.parseInt("101111", 2)), Integer.parseInt("011111", 2));
        try { nextSmallestArithmetic(Integer.parseInt("0", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextSmallestArithmetic(Integer.parseInt("1", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextSmallestArithmetic(Integer.parseInt("11111", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextSmallestArithmetic(Integer.parseInt("1111111111111111111111111111111", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
    }

    @Test
    public void testNextLargestArithmetic() throws Exception {
        assertEquals(nextLargestArithmetic(Integer.parseInt("1010", 2)), Integer.parseInt("1100", 2));
        assertEquals(nextLargestArithmetic(Integer.parseInt("100001", 2)), Integer.parseInt("100010", 2));
        assertEquals(nextLargestArithmetic(Integer.parseInt("111", 2)), Integer.parseInt("1011", 2));
        assertEquals(nextLargestArithmetic(Integer.parseInt("10111100000", 2)), Integer.parseInt("11000000111", 2));
        try { nextLargestArithmetic(Integer.parseInt("0", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextLargestArithmetic(Integer.parseInt("1111000000000000000000000000000", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextLargestArithmetic(Integer.parseInt("1000000000000000000000000000000", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { nextLargestArithmetic(Integer.parseInt("1111111111111111111111111111111", 2)); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
    }

}