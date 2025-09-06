package practice6.DesignPatterns.AbstractFactory;

public class MacButton extends Button {
    private final String PLATFORM = "MacOS";

    public MacButton(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return String.format("Платформа: %s%n%s", PLATFORM, super.draw());
    }
}
