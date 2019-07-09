package Test.Obserwator;

public class YouTubeObserver implements Observer {

    private String name;
    private Integer unwatchedVideos;

    public YouTubeObserver(String name) {
        this.name = name;
        this.unwatchedVideos = 0;
    }

    @Override
    public void update() {
        unwatchedVideos++;
        System.out.println("Hello " + name + ". There is a new video available. You have " + unwatchedVideos + " unwatched videos!" );
    }
}
