package patterns.structural.facade;

public class Starter {
    public void on() {
        System.out.println("Starter is on");
    }

    public void waitForStart() {
        System.out.println("Wait for engine start");
        System.out.println("Engine was started");
        System.out.println("Starter is off");
    }
}
