package patterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    public void test() {
        Base base = new Base();
        Engine engine = new Engine();
        Wheels wheels = new Wheels();

        Car car = new Car();
        car.addElement(base).addElement(engine).addElement(wheels);

        Visitor visitor = new Tuner();

        car.accept(visitor);
    }
}
