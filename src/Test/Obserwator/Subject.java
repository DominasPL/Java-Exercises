package Test.Obserwator;

public interface Subject {

    void register(Observer o);
    void unregister(Observer observer);
    void notifyObservers();

}
