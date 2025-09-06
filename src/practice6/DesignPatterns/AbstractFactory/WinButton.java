package practice6.DesignPatterns.AbstractFactory;

public class WinButton extends Button {
    private final String PLATFORM = "Windows";

    public WinButton(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return String.format("Платформа: %s%n%s", PLATFORM, super.draw());
    }
}
