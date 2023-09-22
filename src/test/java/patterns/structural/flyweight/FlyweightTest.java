package patterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class FlyweightTest {

    @Test
    public void test() {
        int minX = 10;
        int maxX = 30;

        int minY = 0;
        int maxY = 10;

        int count = 10;

        for (int i = 1; i <= count; i++) {
            Tree tree = TreeFactory.getTree(Tree.COLOR.GREEN);

            Random random = new Random();
            int x = random.nextInt(minX, maxX);
            int y = random.nextInt(minY, maxY);

            tree.draw(x, y);
        }
    }
}
