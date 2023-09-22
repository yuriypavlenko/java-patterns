package patterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void test() {
        Numbers numbers = new Numbers();
        Iterator iterator = numbers.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
