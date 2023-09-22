package patterns.behavioral.strategy;

public class PayByApplePay implements PayBy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment by ApplePay on " + amount);
    }
}