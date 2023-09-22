package patterns.structural.decorator;

public class Coffee implements Drink {
    @Override
    public String label() {
        return "Кофе";
    }
}
