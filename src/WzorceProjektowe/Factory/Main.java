package WzorceProjektowe.Factory;

public class Main {

    public static void main(String[] args) {

        Creator creator = new FruitsCreator();
        creator.doAction("watermelon");

        creator = new MeatCreator();
        creator.doAction("ham");
    }


}
