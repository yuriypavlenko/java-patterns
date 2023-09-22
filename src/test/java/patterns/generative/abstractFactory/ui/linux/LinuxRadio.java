package patterns.generative.abstractFactory.ui.linux;

import patterns.generative.abstractFactory.UIElement;

public class LinuxRadio implements UIElement {

    @Override
    public void display() {
        System.out.println("Im Linux Radio");
    }
}
