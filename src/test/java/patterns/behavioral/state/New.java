package patterns.behavioral.state;

import java.util.Random;

public class New implements State {

    Acquirer acquirer;

    New() {
        this.acquirer = Acquirer.getInstance();
    }

    @Override
    public void doAction(Context context) {
        OrderAction next = context.getNextAction();
        if (next == OrderAction.PAYMENT) {
            System.out.println("Order payment...");
            boolean paid = acquirer.doPayment();
            if (paid) {
                System.out.println("Order paid...");
                context.setState(new Paid());
            } else {
                System.out.println("Order payment declined...");
                context.setState(new Declined());
            }
        }
        else if (next == OrderAction.CANCEL) {
            System.out.println("Order canceled...");
            context.setState(new Canceled());
        }
    }
}
