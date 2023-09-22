package patterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyTests {

    @Test
    public void test() {
        Proxy proxy = new Proxy("admin");
        int code = proxy.execute("delete all products");
        assertEquals(0, code);
    }

    @Test
    public void usingInitializedExecutor() {
        Proxy proxy = new Proxy("admin");
        int code = proxy.execute("delete all products");
        code = proxy.execute("delete all products");
        assertEquals(0, code);
    }

    @Test
    public void userNotAdminAccessDenied() {
        Proxy proxy = new Proxy("user");
        int code = proxy.execute("delete all products");
        assertEquals(999, code);
    }

    @Test
    public void userNotAdminNotAdminCommand() {
        Proxy proxy = new Proxy("user");
        int code = proxy.execute("see all products");
        assertEquals(0, code);
    }
}
