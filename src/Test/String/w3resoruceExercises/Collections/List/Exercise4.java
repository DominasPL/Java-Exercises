package Test.String.w3resoruceExercises.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {

        //Write a Java program to copy one array list into another.

        List<String> strList = Exercise1.addStrElementsToArrayList(new ArrayList<>());
        List<String> str2List = Exercise1.addStrElementsToArrayList(new ArrayList<>());

        List<String> newList = copyStr1ToStr2(strList, str2List);
        System.out.println(newList);

        List<String> newList1 = copyStr1ToStr2_1(strList, str2List);
        System.out.println(newList1);

    }

    private static List<String> copyStr1ToStr2(List<String> strList, List<String> str2List) {

        strList.addAll(str2List);

        return strList;
    }

    private static List<String> copyStr1ToStr2_1(List<String> strList, List<String> str2List) {

        List<String> newList = new ArrayList<>();

        for (String string : strList) {
            newList.add(string);
        }

        for (String string : str2List) {
            newList.add(string);
        }

        return newList;
    }

}
