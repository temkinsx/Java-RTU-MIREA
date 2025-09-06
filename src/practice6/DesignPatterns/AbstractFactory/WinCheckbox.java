package practice6.DesignPatterns.AbstractFactory;

public class WinCheckbox extends Checkbox {
    private final String PLATFORM = "Windows";

    public WinCheckbox(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return String.format("Платформа: %s%n%s", PLATFORM, super.draw());
    }
}
