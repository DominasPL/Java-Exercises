package Test.String.w3resoruceExercises.Collections.List2;

import Test.String.w3resoruceExercises.Collections.List.Exercise1;

import java.util.*;

public class LinkedList1 {

    public static void main(String[] args) {

        //Write a Java program to iterate a linked list in reverse order.

        List<String> strList = Exercise1.addStrElementsToArrayList(new LinkedList<>());

        reverseList(strList);
        iterateList(strList);

    }

    private static void iterateList(List<String> strList) {

        Iterator<String> iterator = strList.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

    private static void reverseList(List<String> strList) {

        Collections.reverse(strList);

    }

}
