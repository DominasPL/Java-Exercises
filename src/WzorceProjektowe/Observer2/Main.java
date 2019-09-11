package WzorceProjektowe.Observer2;

public class Main {

    public static void main(String[] args) {

        Publisher blog = new Blog();
        Observer blogUser1 = new BlogUser("Dominas");
        Observer blogUser2 = new BlogUser("Mike");
        Observer blogUser3 = new BlogUser("Andrzej");
        Observer blogUser4 = new BlogUser("Dorota");

        blog.register(blogUser1);
        blog.noitifyObservers();
        System.out.println("******************");
        blog.noitifyObservers();
        System.out.println("******************");
        blog.unregister(blogUser1);
        blog.register(blogUser2);
        blog.register(blogUser3);
        blog.noitifyObservers();
        blog.noitifyObservers();

    }

}
