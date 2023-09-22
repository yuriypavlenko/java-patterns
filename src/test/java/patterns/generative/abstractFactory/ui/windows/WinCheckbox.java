package patterns.generative.abstractFactory.ui.windows;

import patterns.generative.abstractFactory.UIElement;

public class WinCheckbox implements UIElement {

    @Override
    public void display() {
        System.out.println("Im Windows Checkbox");
    }
}
