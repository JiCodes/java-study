
// Singleton pattern implementation
class Logger {
    private static Logger instance = null;
    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}


public class Configuration {
    private static Configuration instance = null;
    private Configuration() {
        // private constructor to prevent instantiation from outside the class
    }
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
    // other methods and variables can be defined here
    public void configure(String message) {
        System.out.println("[Status]: " + message);
    }

}
