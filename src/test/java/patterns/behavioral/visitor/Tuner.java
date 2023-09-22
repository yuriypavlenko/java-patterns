package patterns.behavioral.visitor;

public class Tuner implements Visitor {
    @Override
    public void visit(Base element) {
        System.out.println("Clean the base");
    }

    @Override
    public void visit(Engine element) {
        System.out.println("Check the engine");
    }

    @Override
    public void visit(Wheels element) {
        System.out.println("Pump up the wheels");
    }
}
