//Вариант 1

package practice6.DesignPatterns.Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

public class AppSettings {
    private static volatile AppSettings instance;
    private final Map<String, String> settings = new ConcurrentHashMap<>();

    private AppSettings() {}

    public static AppSettings getInstance() {
        AppSettings result = instance;
        if (result == null) {
            synchronized (AppSettings.class) {
                result = instance;
                if (result == null) {
                    instance = result = new AppSettings();
                }
            }
        }
        return result;
    }

    public String getSetting(String settingName) {
        if (!settings.containsKey(settingName)) throw new NoSuchElementException("данная настройка не существует");
        return settings.get(settingName);
    }

    public void setSetting(String settingName, String settingValue) {
        settings.put(settingName, settingValue);
    }

    @Override
    public String toString() {
        return "AppSettings{" + "settings=" + settings + '}';
    }
}
