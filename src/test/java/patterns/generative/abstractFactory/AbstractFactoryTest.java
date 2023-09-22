package patterns.generative.abstractFactory;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void test() {
        Application app = new Application(Application.APP_TYPE.LINUX);

        app.getButton().display();
        app.getCheckbox().display();
        app.getRadio().display();
    }
}
