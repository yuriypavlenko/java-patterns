package patterns.behavioral.visitor;

public interface CarElement {
    void accept(Visitor visitor);
}
