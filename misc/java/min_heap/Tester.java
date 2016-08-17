package min_heap;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/16/16.
 */
public class Tester {
    @Test
    public void testMinHeap() throws Exception {
        MinHeap<Integer> m = new MinHeap<>();
        assertTrue(m.isEmpty());
        assertEquals(m.size(), 0);
        m.insert(5);
        m.insert(7);
        m.insert(2);
        assertFalse(m.isEmpty());
        assertEquals(m.size(), 3);
        assertEquals((int) m.peekMin(), 2);
        m.insert(8);
        m.insert(1);
        m.insert(6);
        assertEquals(m.size(), 6);
        assertEquals((int) m.extractMin(), 1);
        assertEquals((int) m.extractMin(), 2);
        assertEquals((int) m.peekMin(), 5);
        m.insert(12);
        m.insert(9);
        m.insert(0);
        m.insert(10);
        m.insert(16);
        m.insert(18);
        m.insert(15);
        m.insert(10);
        m.insert(0);
        assertEquals((int) m.extractMin(), 0);
        assertEquals((int) m.peekMin(), 0);
        assertEquals((int) m.extractMin(), 0);
        assertEquals(m.size(), 11);
        assertEquals((int) m.extractMin(), 5);
        m.insert(19);
        m.insert(4);
        m.insert(17);
        assertEquals((int) m.extractMin(), 4);
        assertEquals((int) m.extractMin(), 6);
        assertEquals((int) m.extractMin(), 7);
        assertEquals((int) m.extractMin(), 8);
        assertEquals((int) m.extractMin(), 9);
        assertEquals((int) m.extractMin(), 10);
        assertEquals((int) m.extractMin(), 10);
        assertEquals((int) m.extractMin(), 12);
        assertEquals(m.size(), 5);
        assertEquals((int) m.extractMin(), 15);
        assertEquals((int) m.extractMin(), 16);
        assertEquals((int) m.extractMin(), 17);
        assertEquals((int) m.extractMin(), 18);
        assertEquals((int) m.extractMin(), 19);
        assertTrue(m.isEmpty());
        m.insert(3);
        m.insert(2);
        m.insert(1);
        m.insert(4);
        m.insert(5);
        assertEquals((int) m.extractMin(), 1);
        assertEquals((int) m.extractMin(), 2);
        assertEquals((int) m.extractMin(), 3);
        assertEquals(m.size(), 2);
        assertEquals((int) m.extractMin(), 4);
        assertEquals((int) m.extractMin(), 5);
        assertTrue(m.isEmpty());
    }

    @Test
    public void testMinHeapWithArray() throws Exception {

    }
}
