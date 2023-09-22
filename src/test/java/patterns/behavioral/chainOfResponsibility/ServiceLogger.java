package patterns.behavioral.chainOfResponsibility;

public class ServiceLogger extends AbstractLogger {

    @Override
    public void write(String message) {
        System.out.printf("ServiceLogger write: %s \n", message);
    }
}
