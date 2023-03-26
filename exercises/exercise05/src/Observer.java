// Observer pattern implementation

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update();
}

class EmailNotification implements Observer {
    public void update() {
        System.out.println("Sending email notification");
    }
}

class PushNotification implements Observer {
    public void update() {
        System.out.println("Sending push notification");
    }
}

class NotificationService {
    private List<Observer> observers = new ArrayList<Observer>();
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}