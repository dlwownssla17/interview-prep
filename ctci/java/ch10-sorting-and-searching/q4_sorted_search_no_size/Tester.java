package q4_sorted_search_no_size;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q4_sorted_search_no_size.Question.*;

/**
 * Created by jjlee on 9/19/16.
 */
public class Tester {
    Listy listy;

    @BeforeMethod
    public void setup() throws Exception {
        listy = new Listy();
        listy.add(1);
        listy.add(3);
        listy.add(4);
        listy.add(4);
        listy.add(4);
        listy.add(4);
        listy.add(5);
        listy.add(7);
        listy.add(9);
        listy.add(9);
        listy.add(10);
        listy.add(12);
    }

    @Test
    public void testSortedSearchNoSize() throws Exception {
        assertEquals(sortedSearchNoSize(listy, 0), -1);
        assertEquals(sortedSearchNoSize(listy, 1), 0);
        assertEquals(sortedSearchNoSize(listy, 2), -1);
        assertEquals(sortedSearchNoSize(listy, 3), 1);
        assertEquals(sortedSearchNoSize(listy, 4), 2);
        assertEquals(sortedSearchNoSize(listy, 5), 6);
        assertEquals(sortedSearchNoSize(listy, 6), -1);
        assertEquals(sortedSearchNoSize(listy, 7), 7);
        assertEquals(sortedSearchNoSize(listy, 9), 8);
        assertEquals(sortedSearchNoSize(listy, 10), 10);
        assertEquals(sortedSearchNoSize(listy, 11), -1);
        assertEquals(sortedSearchNoSize(listy, 12), 11);
    }

}