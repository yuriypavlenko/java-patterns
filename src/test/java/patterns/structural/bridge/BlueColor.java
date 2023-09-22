package patterns.structural.bridge;

public class BlueColor implements Color {

    @Override
    public void fill() {
        System.out.println("Filled by Blue color");
    }
}
