import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min, max;
    protected int randomInt;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    public Iterator<Integer> iterator() {
        return new RandomIterator(min, max, random);
    }

    public int getRandomInt() {
        return randomInt;
    }
}
