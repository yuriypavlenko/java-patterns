package patterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StateTest {

    @Test
    public void newOrder() {
        Order order = new Order();
        assertTrue(order.getCurrentState() instanceof New);
    }

    @Test
    public void orderPaid() {
        Acquirer.getInstance().setPaySuccess(true);

        Order order = new Order();
        order.pay();
        assertTrue(order.getCurrentState() instanceof Paid);
    }

    @Test
    public void orderPaymentDeclined() {
        Acquirer.getInstance().setPaySuccess(false);

        Order order = new Order();
        order.pay();
        assertTrue(order.getCurrentState() instanceof Declined);
    }

    @Test
    public void orderPaymentCanceled() {
        Acquirer.getInstance().setPaySuccess(true);

        Order order = new Order();
        order.pay();
        order.cancel();
        assertTrue(order.getCurrentState() instanceof Canceled);
    }
}
