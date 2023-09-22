package patterns.generative.abstractFactory;

public class Application {
    private UIElement button;
    private UIElement checkbox;
    private UIElement radio;

    enum APP_TYPE {
        WINDOWS,
        MAC,
        LINUX
    }
    public Application(APP_TYPE type) {
        UIFactory factory = null;
        switch (type) {
            case WINDOWS -> factory = new UIWinFactory();
            case MAC -> factory = new UIMacFactory();
            case LINUX -> factory = new UILinuxFactory();
        }

        button = factory.getButton();
        checkbox = factory.getCheckbox();
        radio = factory.getRadio();
    }

    public UIElement getButton() {
        return button;
    }

    public UIElement getCheckbox() {
        return checkbox;
    }

    public UIElement getRadio() {
        return radio;
    }
}
