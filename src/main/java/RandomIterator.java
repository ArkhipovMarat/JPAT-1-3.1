import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;

public class RandomIterator implements Iterator <Integer> {
    protected Random random;
    protected int min, max;

    public RandomIterator(int min, int max, Random random) {
        this.min = min;
        this.max = max;
        this.random = random;
    }

    public boolean hasNext() {
        return true;
    }

    public Integer next () {
        int diff = max - min;
        int randomInt = random.nextInt(diff + 1);
        randomInt += min;
        return randomInt;
    }

    public void remove() {
    }

    public void forEachRemaining(Consumer action) {
    }
}
