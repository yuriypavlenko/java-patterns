package patterns.behavioral.strategy;

public class PayByCreditCard implements PayBy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment by credit card on " + amount);
    }
}
