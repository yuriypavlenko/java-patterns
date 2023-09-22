package patterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTest {

    @Test
    public void test() {
        Drink drink = new Sugar(new Milk(new Coffee()));
        assertEquals("Кофе с молоком с сахаром", drink.label());
    }

    @Test
    public void oneDecorator() {
        Drink drink = new Milk(new Coffee());
        assertEquals("Кофе с молоком", drink.label());
    }

    @Test
    public void noDecorators() {
        Drink drink = new Coffee();
        assertEquals("Кофе", drink.label());
    }
}
