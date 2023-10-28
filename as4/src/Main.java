public class Main {
    public static void main(String[] args) {
        // Create a messaging app
        MessagingApp messagingApp = new SimpleMessagingApp();

        // Create users (observers)
        User user1 = new User("User 1");
        User user2 = new User("User 2");

        // Register users as observers
        messagingApp.registerObserver(user1);
        messagingApp.registerObserver(user2);

        // Send a message, and observers will be notified
        messagingApp.sendMessage("Hello, world!");

        // Factory Pattern: Create different types of notifications
        Notification emailNotification = new EmailNotification();
        emailNotification.sendNotification();

        Notification pushNotification = new PushNotification();
        pushNotification.sendNotification();
    }
}