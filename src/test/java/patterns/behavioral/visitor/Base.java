package patterns.behavioral.visitor;

public class Base implements CarElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
