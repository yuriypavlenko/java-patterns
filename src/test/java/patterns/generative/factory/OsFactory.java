package patterns.generative.factory;

public class OsFactory {
    enum OS_TYPE {
        WINDOWS,
        LINUX,
        MAC
    }

    public static OS get (OS_TYPE type) {
        OS os = null;
        switch (type) {
            case WINDOWS -> os = new Windows();
            case LINUX -> os = new Linux();
            case MAC -> os = new Mac();
        }
        return os;
    }
}
