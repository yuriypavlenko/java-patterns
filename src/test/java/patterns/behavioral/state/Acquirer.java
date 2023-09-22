package patterns.behavioral.state;

public class Acquirer {
    private static Acquirer instance;
    private boolean paySuccess;

    private Acquirer() {
        this.paySuccess = true;
    }

    public static Acquirer getInstance() {
        if (instance == null) {
            instance = new Acquirer();
        }
        return instance;
    }

    public void setPaySuccess(boolean status) {
        instance.paySuccess = status;
    }

    public boolean doPayment() {
        return paySuccess;
    }
}
