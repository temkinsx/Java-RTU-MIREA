package practice6.DesignPatterns.AbstractFactory;

public class MacCheckbox extends Checkbox {
    private final String PLATFORM = "MacOS";

    public MacCheckbox(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return String.format("Платформа: %s%n%s", PLATFORM, super.draw());
    }
}
