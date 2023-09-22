package patterns.behavioral.state;

public class Canceled implements State {

    Canceled() {
        System.out.println("Order was canceled");
    }

    @Override
    public void doAction(Context context) {

    }
}
