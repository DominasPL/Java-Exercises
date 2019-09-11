package WzorceProjektowe.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Publisher {

    private List<Observer> observers;

    public YouTubeChannel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
