package patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarElement {
    List<CarElement> elements = new ArrayList<>();

    public Car addElement(CarElement element) {
        elements.add(element);
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        elements.forEach(element -> element.accept(visitor));
    }
}
