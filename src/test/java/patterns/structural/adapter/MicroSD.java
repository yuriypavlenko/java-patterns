package patterns.structural.adapter;

public class MicroSD {

    public void connect() {
        System.out.println("MicroSD connected!");
    }

    public String read() {
        return "Read data from MicroSD";
    }
}
