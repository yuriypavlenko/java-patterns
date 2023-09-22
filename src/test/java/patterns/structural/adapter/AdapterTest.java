package patterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {

    @Test
    public void test() {
        MicroSD card = new MicroSD();
        MicroSDReader reader = new MicroSDReader(card); // adapter
        Computer computer = new Computer();
        computer.connectUsbDevice(reader);
        String data = computer.readFromUsbDevice();

        assertEquals("Read data from MicroSD", data);
    }
}
