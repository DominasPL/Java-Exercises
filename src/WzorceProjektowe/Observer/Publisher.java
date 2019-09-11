package WzorceProjektowe.Observer;

public interface Publisher {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();

}
