package Test.String.w3resoruceExercises.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        //Write a Java program to sort a given array list.

        List<String> strList = Exercise1.addStrElementsToArrayList(new ArrayList<>());

        List<String> sortedList = sortList(strList);
        System.out.println(sortedList);

    }

    private static List<String> sortList(List<String> strList) {

        strList.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        return strList;
    }




}
