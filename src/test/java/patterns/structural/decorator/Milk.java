package patterns.structural.decorator;

public class Milk extends CoffeeDecorator {
    Milk(Drink drink) {
        super(drink, " с молоком");
    }
}