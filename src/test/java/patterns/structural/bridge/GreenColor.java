package patterns.structural.bridge;

public class GreenColor implements Color {

    @Override
    public void fill() {
        System.out.println("Filled by Green color");
    }
}
