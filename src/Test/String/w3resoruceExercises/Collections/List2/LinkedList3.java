package Test.String.w3resoruceExercises.Collections.List2;

import Test.String.w3resoruceExercises.Collections.List.Exercise1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList3 {

    public static void main(String[] args) {

        //Write a Java program to get the first and last occurrence of the specified elements in a linked list

        List<String> strList = Exercise1.addStrElementsToArrayList(new LinkedList<>());

        String pattern = "Hello";

        int[] firstAndLastOccurrence = getFirstAndLastOccurrence(strList, pattern);

        System.out.println("First occurrence '" + pattern +"' in LinkedList - index: " +firstAndLastOccurrence[0]);
        System.out.println("Last occurrence '" + pattern +"' in LinkedList - index: " +firstAndLastOccurrence[1]);


    }



    private static int[] getFirstAndLastOccurrence(List<String> strList, String pattern) {

        int[] elementOccurrenceIndexes = new int[2];
        int counter = 0;

        for (int i = 0; i < strList.size() ; i++) {

            if (counter == 0 && strList.get(i).equals(pattern)) {
                elementOccurrenceIndexes[0] = i;
                counter++;
            } else if (strList.get(i).equals(pattern))
                elementOccurrenceIndexes[1] = i;
        }

        return elementOccurrenceIndexes;

    }

}
