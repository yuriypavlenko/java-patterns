package patterns.behavioral.chainOfResponsibility;

import org.junit.jupiter.api.Test;

public class ChainTest {

    @Test
    public void test() {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();
        ServiceLogger serviceLogger = new ServiceLogger();

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(serviceLogger);

        consoleLogger.log("log message");
    }

    @Test
    public void singleLogger() {
        FileLogger fileLogger = new FileLogger();
        fileLogger.log("log message");
    }
}
