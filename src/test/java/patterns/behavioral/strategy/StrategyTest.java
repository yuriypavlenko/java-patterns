package patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void test() {
        Order order = new Order(1000);
        order.pay(new PayByApplePay());
    }
}
