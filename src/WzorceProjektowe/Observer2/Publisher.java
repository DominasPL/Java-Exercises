package WzorceProjektowe.Observer2;

public interface Publisher {

    void register(Observer observer);
    void unregister(Observer observer);
    void noitifyObservers();

}
