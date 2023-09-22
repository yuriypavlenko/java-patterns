package patterns.generative.factory;

public class Windows implements OS {
    @Override
    public String about() {
        return "Windows 10";
    }
}
