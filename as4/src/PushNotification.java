// Concrete PushNotification
public class PushNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending a push notification.");
    }
}