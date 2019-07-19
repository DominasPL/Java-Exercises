package Test.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[6];
        people[0] = new Person("Dominas", "Hulks");
        people[1] = new Person("Janusz", "Nosacz");
        people[2] = new Person("Wacek", "Nosacz");
        people[3] = new Person("Iron", "Man");
        people[4] = new Person("Thor", "Fat");
        people[5] = new Person("Grażyna", "Januszowa");

        Arrays.stream(people)
                .sorted()
                .forEach(System.out::println);



    }
}
