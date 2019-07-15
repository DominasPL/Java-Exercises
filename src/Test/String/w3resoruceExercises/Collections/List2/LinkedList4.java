package Test.String.w3resoruceExercises.Collections.List2;

import Test.String.w3resoruceExercises.Collections.List.Exercise1;

import java.util.LinkedList;
import java.util.List;

public class LinkedList4 {

    public static void main(String[] args) {

        //Write a Java program to remove first and last element from a linked list

        List<String> strList = Exercise1.addStrElementsToArrayList(new LinkedList<>());

        System.out.println(strList);

        removeFirstAndLastElement(strList);

        System.out.println(strList);
    }

    private static void removeFirstAndLastElement(List<String> strList) {

        strList.remove(0);
        strList.remove(strList.size() - 1);
    }

}
