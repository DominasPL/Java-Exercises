package Test.String.w3resoruceExercises.Collections.List2;

import Test.String.w3resoruceExercises.Collections.List.Exercise1;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

    public static void main(String[] args) {

        //Write a Java program to insert elements into the linked list at the first and last position.

        List<String> strList = Exercise1.addStrElementsToArrayList(new LinkedList<>());

        String element1 = "Watermelon";
        String element2 = "Pineapple";

        System.out.println(strList);

        insertElementsFirstLastPosition(strList, element1, element2);

        System.out.println(strList);

    }

    private static void insertElementsFirstLastPosition(List<String> strList, String element1, String element2) {

        if (strList.size() > 1) {
            strList.set(0, element1);
            strList.set(strList.size() - 1, element2);
        }

    }

}
