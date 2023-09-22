package patterns.behavioral.state;

public class Paid implements State {
    @Override
    public void doAction(Context context) {
        OrderAction next = context.getNextAction();
        if (next == OrderAction.CANCEL) {
            System.out.println("Canceling order...");
            context.setState(new Canceled());
        }
    }
}
