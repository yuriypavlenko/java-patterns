package patterns.behavioral.templateMethod;

public class SportCar extends Car {
    public SportCar(String color) {
        super(color);
    }

    @Override
    protected void setEngine() {
        System.out.println("Setting sport engine");
    }

    @Override
    protected void setWheels() {
        System.out.println("Setting sport wheels");
    }
}
