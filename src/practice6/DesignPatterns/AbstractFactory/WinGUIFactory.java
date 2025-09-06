package practice6.DesignPatterns.AbstractFactory;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton(String name) {
        return new WinButton(name);
    }

    @Override
    public Checkbox createCheckBox(String name) {
        return new WinCheckbox(name);
    }
}
