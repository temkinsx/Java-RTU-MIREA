package practice6.DesignPatterns.Singleton;

public class App {
    public static void main(String[] args) throws InterruptedException {
        AppSettings settings = AppSettings.getInstance();

        settings.setSetting("lang", "ru");
        settings.setSetting("theme", "default");
        settings.setSetting("resolution", "400x300");
        settings.setSetting("volume", "55");

        Runnable task1 = () -> {
            AppSettings s = AppSettings.getInstance();
            s.setSetting("theme", "dark");
            System.out.println("Поток " + Thread.currentThread().getName() + " изменил theme(" + System.identityHashCode("theme") + ") на " + s.getSetting("theme"));
        };

        Runnable task2 = () -> {
            AppSettings s = AppSettings.getInstance();
            s.setSetting("theme", "light");
            System.out.println("Поток " + Thread.currentThread().getName() + " изменил theme(" + System.identityHashCode("theme") + ") на " + s.getSetting("theme"));
        };

        Thread t1 = new Thread(task1, "T1");
        Thread t2 = new Thread(task2, "T2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();


        System.out.println("lang: " + settings.getSetting("lang"));
        System.out.println("theme: " + settings.getSetting("theme"));
        System.out.println("resolution: " + settings.getSetting("resolution"));
        System.out.println(settings);
    }
}
