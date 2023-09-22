package patterns.behavioral.state;

public class Order implements Context {
    State state;
    OrderAction nextAction;

    Order() {
        state = new New();
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public OrderAction getNextAction() {
        return nextAction;
    }

    public State getCurrentState() {
        return state;
    }

    public void pay() {
        nextAction = OrderAction.PAYMENT;
        state.doAction(this);
    }

    public void cancel() {
        nextAction = OrderAction.CANCEL;
        state.doAction(this);
    }
}
