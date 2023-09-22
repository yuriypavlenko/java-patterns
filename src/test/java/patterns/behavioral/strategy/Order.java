package patterns.behavioral.strategy;

public class Order {
    private int amount;

    public Order(int amount) {
        this.amount = amount;
    }
    public void pay(PayBy payStrategy) {
        payStrategy.pay(amount);
    }
}
