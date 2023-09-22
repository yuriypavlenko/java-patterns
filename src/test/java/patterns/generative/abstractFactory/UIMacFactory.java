package patterns.generative.abstractFactory;

import patterns.generative.abstractFactory.ui.mac.MacButton;
import patterns.generative.abstractFactory.ui.mac.MacCheckbox;
import patterns.generative.abstractFactory.ui.mac.MacRadio;

public class UIMacFactory implements UIFactory {
    @Override
    public UIElement getButton() {
        return new MacButton();
    }

    @Override
    public UIElement getCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public UIElement getRadio() {
        return new MacRadio();
    }
}
