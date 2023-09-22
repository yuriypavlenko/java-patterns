package patterns.structural.decorator;

public class Sugar extends CoffeeDecorator {
    Sugar(Drink drink) {
        super(drink, " с сахаром");
    }
}
