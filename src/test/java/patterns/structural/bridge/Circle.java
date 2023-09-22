package patterns.structural.bridge;

import javax.swing.*;

public class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    @Override
    public void fill() {
        color.fill();
    }
}
