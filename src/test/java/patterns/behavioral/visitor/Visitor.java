package patterns.behavioral.visitor;

public interface Visitor {
    void visit(Base element);
    void visit(Engine element);
    void visit(Wheels element);
}
