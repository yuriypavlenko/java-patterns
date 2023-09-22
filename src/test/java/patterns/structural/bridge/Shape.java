package patterns.structural.bridge;

public abstract class Shape {
    protected Color color;

    Shape(Color color) {
        this.color = color;
    }

    public abstract void fill();
}
