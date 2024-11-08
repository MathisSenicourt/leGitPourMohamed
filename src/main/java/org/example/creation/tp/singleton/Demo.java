package org.example.creation.tp.singleton;
public class Demo {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        for (String key : new String[] { "databaseUrl", "apiKey", "env" }) {
            System.out.println(key + ": " + config.getSetting(key));
        }
        config.setSetting("env", "production");
        System.out.println("env: " + config.getSetting("env"));

        Configuration config2 = Configuration.getInstance();
        System.out.println("env: " + config2.getSetting("env"));

        System.out.println(config == config2);
    }
}


