package patterns.behavioral.state;

public interface Context {
    void setState(State state);
    OrderAction getNextAction();
}
