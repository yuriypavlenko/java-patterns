package patterns.structural.proxy;

import patterns.structural.composite.Product;

public class Proxy implements CommandExecutor {
    private final String userRole;
    private Executor executor;


    Proxy (String userRole) {
        this.userRole = userRole;
    }

    @Override
    public int execute(String command) {
        if (command.startsWith("delete") && !userRole.equals("admin")) {
            return 999;
        }

        System.out.println("User is admin. Execute command...");

        if (executor == null) {
            System.out.println("Initializing executor...");
            executor = new Executor();
        }

        System.out.println("Execute command...");
        return executor.execute(command);
    }
}
