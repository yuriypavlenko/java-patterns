package patterns.generative.abstractFactory.ui.windows;

import patterns.generative.abstractFactory.UIElement;

public class WinRadio implements UIElement {

    @Override
    public void display() {
        System.out.println("Im Windows Radio");
    }
}
