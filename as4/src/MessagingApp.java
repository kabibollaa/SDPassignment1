// Subject (MessagingApp) interface
public interface MessagingApp {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);

    void sendMessage(String s);
}