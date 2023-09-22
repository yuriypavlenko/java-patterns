package patterns.behavioral.templateMethod;

abstract public class Car {
    private final String color;

    public Car(String color) {
        this.color = color;
    }

    // шаблонный метод
    public void build() {
        setBase();
        setEngine();
        setWheels();
        setColor();
    }

    private void setBase() {
        System.out.println("Setting car base");
    }

    protected abstract void setEngine();
    protected abstract void setWheels();

    private void setColor() {
        System.out.println("Setting car color to " + color);
    }
}
