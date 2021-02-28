import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int max;
    private int min;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    private int makeNewValue() {
        random = new Random();
        int value = min + random.nextInt(max - min + 1);
        return value;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                if (makeNewValue() == 100) {
                    return false;
                }
                return true;
            }

            @Override
            public Integer next() {
                return makeNewValue();
            }
        };
    }
}
