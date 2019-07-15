package Test.String.w3resoruceExercises.Collections.List2;

import Test.String.w3resoruceExercises.Collections.List.Exercise1;

import java.util.LinkedList;
import java.util.List;

public class LinkedList6 {

    public static void main(String[] args) {

        //Write a Java program to compare two linked lists.

        List<String> strList1 = Exercise1.addStrElementsToArrayList(new LinkedList<>());
        List<String> strList2 = Exercise1.addStrElementsToArrayList(new LinkedList<>());


        boolean result1 = compareLists(strList1, strList2);
        System.out.println(result1);

        boolean result2 = compareLists1(strList1, strList2);
        System.out.println(result2);


    }

    private static boolean compareLists1(List<String> strList1, List<String> strList2) {

        boolean result = true;

        if (strList1.size() != strList2.size())
            return false;

        for (int i = 0; i < strList1.size(); i++) {

            if (!strList1.get(i).equals(strList2.get(i)))
                result = false;
        }

        return result;

    }


    private static boolean compareLists(List<String> strList1, List<String> strList2) {

        return strList1.equals(strList2);
    }

}
