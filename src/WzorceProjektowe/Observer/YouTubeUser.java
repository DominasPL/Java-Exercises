package WzorceProjektowe.Observer;

public class YouTubeUser implements Observer {

    private String name;
    private int videosToWatch;

    public YouTubeUser(String name) {
        this.name = name;
        this.videosToWatch = 0;
    }

    @Override
    public void update() {
        videosToWatch++;
        System.out.println("Hey " + name + " you have " + videosToWatch + " videos to watch!");
    }
}
