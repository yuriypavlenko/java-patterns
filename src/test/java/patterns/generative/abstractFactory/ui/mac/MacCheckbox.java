package patterns.generative.abstractFactory.ui.mac;

import patterns.generative.abstractFactory.UIElement;

public class MacCheckbox implements UIElement {

    @Override
    public void display() {
        System.out.println("Im Mac Checkbox");
    }
}
