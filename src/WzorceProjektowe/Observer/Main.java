package WzorceProjektowe.Observer;

public class Main {

    public static void main(String[] args) {

        Publisher publisher = new YouTubeChannel();

        Observer YTuser1 = new YouTubeUser("Dominik");
        Observer YTuser2 = new YouTubeUser("Andrzej");
        Observer YTuser3 = new YouTubeUser("Darek");

        publisher.register(YTuser1);
        publisher.notifyObservers();
        System.out.println("***********");
        publisher.register(YTuser2);
        publisher.notifyObservers();
        System.out.println("***********");
        publisher.register(YTuser3);
        publisher.notifyObservers();
        System.out.println("***********");
        publisher.unregister(YTuser1);
        publisher.notifyObservers();

    }

}
