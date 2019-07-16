package Test.String.w3resoruceExercises.Collections.Set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        //Write a Java program to find the numbers less than 7 in a tree set.

        Set<Integer> intSet = Set1.createSet(new TreeSet<>(), new Scanner(System.in));

        findNumbersLessThanNumber(intSet);
        findNumbersLessThanNumber1(intSet);

    }

    private static void findNumbersLessThanNumber1(Set<Integer> intSet) {

        intSet.stream()
                .filter(s -> s < 7)
                .forEach(s -> System.out.println(s));

    }


    private static void findNumbersLessThanNumber(Set<Integer> intSet) {

        for (Integer integer : intSet) {
            if (integer < 7)
                System.out.println(integer);
        }
    }

}
