package patterns.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {

    @Test
    public void boxInBox() {
        Product product1 = new Product(3);
        Product product2 = new Product(5);
        Product product3 = new Product(10);

        Box boxSmall = new Box(1).add(product1).add(product2);
        Box boxBig = new Box(2).add(boxSmall).add(product3);

        assertEquals(21, boxBig.getCost());
    }

    @Test
    public void boxWithProducts() {
        Product product1 = new Product(3);
        Product product2 = new Product(5);
        Product product3 = new Product(10);

        Box boxBig = new Box(2).add(product1).add(product2).add(product3);

        assertEquals(20, boxBig.getCost());
    }

    @Test
    public void blankBox() {
        Box boxBig = new Box(2);
        assertEquals(2, boxBig.getCost());
    }

    @Test
    public void productCost() {
        Product product = new Product(3);
        assertEquals(3, product.getCost());
    }

    @Test
    public void boxCleared() {
        Product product1 = new Product(3);
        Product product2 = new Product(5);
        Product product3 = new Product(10);

        Box boxSmall = new Box(1).add(product1).add(product2);
        Box boxBig = new Box(2).add(boxSmall).add(product3);

        boxSmall.clear();
        assertEquals(1, boxSmall.getCost());
        assertEquals(13, boxBig.getCost());

        boxBig.clear();
        assertEquals(2, boxBig.getCost());
    }
}
