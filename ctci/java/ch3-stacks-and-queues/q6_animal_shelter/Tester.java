package q6_animal_shelter;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 8/16/16.
 */
public class Tester {
    @Test
    public void testAnimalQueue() throws Exception {
        AnimalQueue q = new AnimalQueue();
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        try { q.dequeueAny(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { q.dequeueDog(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { q.dequeueCat(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        q.enqueue(c1);
        try { q.dequeueDog(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        q.enqueue(c2);
        q.enqueue(d1);
        q.enqueue(c3);
        q.enqueue(d2);
        assertEquals(c1, q.dequeueCat());
        assertEquals(c2, q.dequeueAny());
        assertEquals(d1, q.dequeueAny());
        q.enqueue(d3);
        q.enqueue(c4);
        assertEquals(c3, q.dequeueAny());
        assertEquals(d2, q.dequeueDog());
        assertEquals(d3, q.dequeueAny());
        assertEquals(c4, q.dequeueCat());
        try { q.dequeueAny(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { q.dequeueDog(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
        try { q.dequeueCat(); fail(); } catch(NoSuchElementException e) { } catch(Exception e) { fail(); }
    }
}