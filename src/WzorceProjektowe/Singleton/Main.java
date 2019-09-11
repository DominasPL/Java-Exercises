package WzorceProjektowe.Singleton;

import WzorceProjektowe.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.address());

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.address());

    }

}
