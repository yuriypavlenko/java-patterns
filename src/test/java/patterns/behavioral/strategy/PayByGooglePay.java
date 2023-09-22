package patterns.behavioral.strategy;

public class PayByGooglePay implements PayBy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment by GooglePay on " + amount);
    }
}
