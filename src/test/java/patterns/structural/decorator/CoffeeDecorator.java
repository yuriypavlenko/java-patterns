package patterns.structural.decorator;

public class CoffeeDecorator implements Drink {
    Drink drink;
    String label;

    CoffeeDecorator(Drink drink, String label) {
        this.drink = drink;
        this.label = label;
    }

    @Override
    public String label() {
        return drink.label() + label;
    }
}
