package patterns.behavioral.chainOfResponsibility;

public class FileLogger extends AbstractLogger {

    @Override
    public void write(String message) {
        System.out.printf("FileLogger write to file: %s \n", message);
    }
}
