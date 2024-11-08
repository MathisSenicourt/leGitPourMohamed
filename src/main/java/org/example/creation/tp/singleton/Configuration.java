package org.example.creation.tp.singleton;
import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static volatile Configuration instance = null;

    private Map<String, String> settings;

    private Configuration() {
        settings = new HashMap<>();
        loadDefaultSettings();
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    private void loadDefaultSettings() {
        settings.put("databaseUrl", "jdbc:mysql://localhost:3306/mydb");
        settings.put("apiKey", "defaultApiKey123");
        settings.put("env", "development");
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        synchronized (this) {
            settings.put(key, value);
        }
    }
}