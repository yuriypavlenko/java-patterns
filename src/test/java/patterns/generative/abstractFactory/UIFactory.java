package patterns.generative.abstractFactory;

public interface UIFactory {
    UIElement getButton();
    UIElement getCheckbox();

    UIElement getRadio();
}
