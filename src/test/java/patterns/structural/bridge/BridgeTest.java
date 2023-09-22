package patterns.structural.bridge;

import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    public void test() {
        Circle circle = new Circle(new RedColor());
        circle.fill();
    }
}
