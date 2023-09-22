package patterns.behavioral.chainOfResponsibility;

public class ConsoleLogger extends AbstractLogger {

    @Override
    public void write(String message) {
        System.out.printf("ConsoleLogger write to console: %s \n", message);
    }
}
