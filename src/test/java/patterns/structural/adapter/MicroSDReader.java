package patterns.structural.adapter;

/**
 * Adapter
 */
public class MicroSDReader implements USBDevice {
    MicroSD card;

    public MicroSDReader(MicroSD card) {
        this.card = card;
    }

    @Override
    public String readFromUsb() {
        card.connect();
        String data = card.read();
        return data;
    }
}
