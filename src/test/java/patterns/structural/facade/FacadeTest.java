package patterns.structural.facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    public void test() {
        EngineFacade facade = new EngineFacade();
        facade.engineStart();
    }
}
