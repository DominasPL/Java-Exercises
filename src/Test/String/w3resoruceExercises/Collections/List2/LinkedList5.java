package Test.String.w3resoruceExercises.Collections.List2;

import Test.String.w3resoruceExercises.Collections.List.Exercise1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList5 {

    public static void main(String[] args) {

        //Write a Java program to convert a linked list to array list

        List<String> strLinkedList = Exercise1.addStrElementsToArrayList(new LinkedList<>());

        convertToArrayList(strLinkedList);

    }

    private static List<String> convertToArrayList(List<String> strLinkedList) {

        return new ArrayList<>(strLinkedList);

    }

}
