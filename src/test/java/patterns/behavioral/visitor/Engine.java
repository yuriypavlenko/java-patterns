package patterns.behavioral.visitor;

public class Engine implements CarElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
