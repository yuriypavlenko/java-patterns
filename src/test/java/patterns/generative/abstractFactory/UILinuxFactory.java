package patterns.generative.abstractFactory;

import patterns.generative.abstractFactory.ui.linux.LinuxButton;
import patterns.generative.abstractFactory.ui.linux.LinuxCheckbox;
import patterns.generative.abstractFactory.ui.linux.LinuxRadio;
import patterns.generative.abstractFactory.ui.windows.WinButton;
import patterns.generative.abstractFactory.ui.windows.WinCheckbox;
import patterns.generative.abstractFactory.ui.windows.WinRadio;

public class UILinuxFactory implements UIFactory {
    @Override
    public UIElement getButton() {
        return new LinuxButton();
    }

    @Override
    public UIElement getCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public UIElement getRadio() {
        return new LinuxRadio();
    }
}
