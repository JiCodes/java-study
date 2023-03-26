import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Singleton pattern
        Configuration config = Configuration.getInstance();
        config.configure("Configuration starting...");

        // Factory Method pattern
        Kitchen kitchen = new Kitchen();
        Chef indianChef = kitchen.getChef("indianChef");
        Chef vietnanmeseChef = kitchen.getChef("vietnameseChef");
        indianChef.cook();
        vietnanmeseChef.cook();


        // Observer pattern
        NotificationService notificationService = new NotificationService();
        EmailNotification emailNotification = new EmailNotification();
        PushNotification pushNotification = new PushNotification();

        notificationService.attach(emailNotification);
        notificationService.attach(pushNotification);

        System.out.println("Notify all observers? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            notificationService.notifyAllObservers();
        }
    }
}
