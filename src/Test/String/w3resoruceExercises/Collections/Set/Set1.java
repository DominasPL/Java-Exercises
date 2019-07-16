package Test.String.w3resoruceExercises.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set1 {

    public static void main(String[] args) {


        //Write a Java program to compare two sets and retain elements which are same on both sets.


        Set<Integer> intSet1 = createSet(new HashSet<>(), new Scanner(System.in));
        Set<Integer> intSet2 = createSet(new HashSet<>(), new Scanner(System.in));

        Set<Integer> sameSetsElements = retainSameSetsElements(intSet1, intSet2);
        System.out.println(sameSetsElements);

        retainSameSetsElements1(intSet1, intSet2);
        System.out.println(intSet1);

    }

    private static void retainSameSetsElements1(Set<Integer> intSet1, Set<Integer> intSet2) {

        intSet1.retainAll(intSet2);

    }


    private static Set<Integer> retainSameSetsElements(Set<Integer> intSet1, Set<Integer> intSet2) {

        Set<Integer> sameElements = new HashSet<>();

        for (Integer integer : intSet1)
        {
            if (intSet2.contains(integer))
                sameElements.add(integer);
        }

        return sameElements;

    }

    private static Set<Integer> createSet(HashSet<Integer> intSet, Scanner scanner) {

        String answer = "";

        while (true) {

            System.out.print("Do you want add new number (y/n): ");
            answer = scanner.nextLine();

            if (answer.equals("y") || answer.equals("Y")) {

                System.out.print("Give a number: ");

                while (!scanner.hasNextInt()) {
                    System.out.print("Incorrect value! Try again: ");
                    scanner.nextLine();
                }

                int value = scanner.nextInt();
                intSet.add(value);

                scanner.nextLine();

            } else if (answer.equals("n") || answer.equals("N"))
                break;
            else
                System.out.println("Incorrect value!");

        }

        return intSet;

    }

}
