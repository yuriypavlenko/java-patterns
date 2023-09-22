package patterns.structural.composite;

public class Product implements Item {

    private final float cost;

    Product(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
