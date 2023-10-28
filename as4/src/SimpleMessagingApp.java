import java.util.ArrayList;
import java.util.List;

// Concrete implementation of the Subject
public class SimpleMessagingApp implements MessagingApp {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Simulate sending a message

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        notifyObservers(message);
    }
}