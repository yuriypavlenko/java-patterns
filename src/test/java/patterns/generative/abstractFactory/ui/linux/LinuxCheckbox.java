package patterns.generative.abstractFactory.ui.linux;

import patterns.generative.abstractFactory.UIElement;

public class LinuxCheckbox implements UIElement {

    @Override
    public void display() {
        System.out.println("Im Linux Checkbox");
    }
}
