package patterns.behavioral.chainOfResponsibility;

public abstract class AbstractLogger {
    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String message) {
        write(message);
        if (nextLogger != null) {
            nextLogger.log(message);
        }
    }

    public abstract void write(String message);
}
