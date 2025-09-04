//Вариант 1

package practice6.DesignPatterns.Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class AppSettings {
    private static AppSettings instance;
    private final Map<String, String> settings;

    private AppSettings() {
        settings = new HashMap<>();
    }

    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
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
