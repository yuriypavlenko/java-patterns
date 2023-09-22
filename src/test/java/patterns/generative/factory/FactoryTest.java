package patterns.generative.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {

    @Test
    public void test() {
        Linux osLinux = new Linux();

        OS os = OsFactory.get(OsFactory.OS_TYPE.LINUX);

        assertEquals(osLinux.about(), os.about());
        assertEquals(os.getClass(), Linux.class);
    }
}
