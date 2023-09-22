package patterns.behavioral.visitor;

public class Wheels implements CarElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
