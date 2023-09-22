package patterns.behavioral.observer;

public class Participant implements Subscriber {
    private String name;

    Participant(String name) {
        this.name = name;
    }
    @Override
    public void event(String message) {
        System.out.printf("%s receive message: %s \n", name, message);
    }
}