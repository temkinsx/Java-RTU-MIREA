package practice6.DesignPatterns.Singleton;

public class Test {
    public static void main(String[] args) {
        AppSettings settings = AppSettings.getInstance();

        settings.setSetting("lang", "ru");
        settings.setSetting("theme", "default");
        settings.setSetting("resolution", "400x300");
        settings.setSetting("volume", "55");

        System.out.println("lang: " + settings.getSetting("lang"));
        System.out.println("resolution: " + settings.getSetting("resolution"));
        System.out.println(settings);
    }
}
