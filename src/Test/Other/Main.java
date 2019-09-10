package Test.Other;

public class Main {


    public static void main(String[] args) {


        String name1 = "Dominik";
        String name2 = "Dominik";

        if (name1.equals(name2))
            System.out.println("Równe");

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
    }

}
