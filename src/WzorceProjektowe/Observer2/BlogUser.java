package WzorceProjektowe.Observer2;

public class BlogUser implements Observer {

    private String name;
    private int articlesToRead;

    public BlogUser(String name) {
        this.name = name;
        this.articlesToRead = 0;
    }

    @Override
    public void update() {
        articlesToRead++;
        System.out.println("Hey " + name + " you have " + articlesToRead + " articles to read!");
    }
}
