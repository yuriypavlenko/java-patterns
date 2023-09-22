package patterns.generative.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BurgerBuilderTest {

    @Test
    public void test() {
        BurgerBuilder burgerBuilder = new BurgerBuilder();
        Burger burger1 = burgerBuilder.build();

        assertEquals(Burger.BREAD_TYPE.WHITE, burger1.getBread()); // по умолчанию с белой булкой
        assertFalse(burger1.isExtraCheese()); // по умолчанию без дополниельного сыра

        Burger burger2 = new BurgerBuilder().bread(Burger.BREAD_TYPE.BLACK).extraCheese().build();
        assertEquals(Burger.BREAD_TYPE.BLACK, burger2.getBread());
        assertTrue(burger2.isExtraCheese());
    }
}
