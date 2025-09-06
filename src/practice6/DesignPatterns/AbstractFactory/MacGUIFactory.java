package practice6.DesignPatterns.AbstractFactory;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton(String name) {
        return new MacButton(name);
    }

    @Override
    public Checkbox createCheckBox(String name) {
        return new MacCheckbox(name);
    }
}
