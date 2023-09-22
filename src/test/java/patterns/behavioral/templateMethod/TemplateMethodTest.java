package patterns.behavioral.templateMethod;

import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    public void test() {
        SportCar car = new SportCar("Red");
        car.build();
    }
}
