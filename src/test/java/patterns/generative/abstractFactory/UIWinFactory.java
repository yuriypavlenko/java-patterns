package patterns.generative.abstractFactory;

import patterns.generative.abstractFactory.ui.windows.WinButton;
import patterns.generative.abstractFactory.ui.windows.WinCheckbox;
import patterns.generative.abstractFactory.ui.windows.WinRadio;

public class UIWinFactory implements UIFactory {
    @Override
    public UIElement getButton() {
        return new WinButton();
    }

    @Override
    public UIElement getCheckbox() {
        return new WinCheckbox();
    }

    @Override
    public UIElement getRadio() {
        return new WinRadio();
    }
}
