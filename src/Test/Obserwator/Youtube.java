package Test.Obserwator;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject {

    private List<Observer> observers;

    public Youtube() {
        this.observers = new ArrayList<>();
    }

    public void addNewVideo() {
        System.out.println("Publishing new video!");
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
