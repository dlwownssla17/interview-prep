package q6_animal_shelter;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by jjlee on 8/16/16.
 */
public class AnimalQueue {
    private LinkedList<Dog> dogs;
    private LinkedList<Cat> cats;
    private int timeStamp;

    public AnimalQueue() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        timeStamp = 0;
    }

    public void enqueue(Animal a) {
        a.setTimeStamp(timeStamp++);
        if (a instanceof Dog) dogs.add((Dog) a);
        else cats.add((Cat) a);
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) throw new NoSuchElementException();
        else if (dogs.isEmpty()) return cats.remove();
        else if (cats.isEmpty()) return dogs.remove();
        else if (dogs.peek().getTimeStamp() > cats.peek().getTimeStamp()) return cats.remove();
        else return dogs.remove();
    }

    public Dog dequeueDog() {
        if (dogs.isEmpty()) throw new NoSuchElementException();
        return dogs.remove();
    }

    public Cat dequeueCat() {
        if (cats.isEmpty()) throw new NoSuchElementException();
        return cats.remove();
    }
}
