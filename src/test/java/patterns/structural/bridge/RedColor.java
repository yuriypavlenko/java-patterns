package patterns.structural.bridge;

public class RedColor implements Color {

    @Override
    public void fill() {
        System.out.println("Filled by Red color");
    }
}
