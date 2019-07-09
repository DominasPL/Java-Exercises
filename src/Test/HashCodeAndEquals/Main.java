package Test.HashCodeAndEquals;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Dominik",20);
        User user2 = new User("Dominik", 30);

        System.out.println(user1.equals(user2));

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }

}
