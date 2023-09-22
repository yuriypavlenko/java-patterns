package patterns.generative.abstractFactory.ui.windows;

import patterns.generative.abstractFactory.UIElement;

public class WinButton implements UIElement {

    @Override
    public void display() {
        System.out.println("Im Windows Button");
    }
}
