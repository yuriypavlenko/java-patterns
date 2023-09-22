package patterns.structural.adapter;

public class Computer {
    USBDevice device;

    public Computer connectUsbDevice(USBDevice device) {
        this.device = device;
        return this;
    }

    public String readFromUsbDevice() {
        return device.readFromUsb();
    }
}
