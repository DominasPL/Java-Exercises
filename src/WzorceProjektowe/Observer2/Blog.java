package WzorceProjektowe.Observer2;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Publisher {

    private List<Observer> observers;

    public Blog() {
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
    public void noitifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
