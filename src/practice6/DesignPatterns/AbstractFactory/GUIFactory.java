package practice6.DesignPatterns.AbstractFactory;

public interface GUIFactory {
    Button createButton(String name);

    Checkbox createCheckBox(String name);

}
