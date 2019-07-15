package Test.String.w3resoruceExercises.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        //Write a Java program of swap two elements in an array list.

        List<String> strList = Exercise1.addStrElementsToArrayList(new ArrayList<>());
        int index1 = Exercise2.getIndex(strList, new Scanner(System.in));
        int index2 = Exercise2.getIndex(strList, new Scanner(System.in));

        System.out.println(strList);

        //Method1
        swapElements1(strList, index1, index2);
        System.out.println(strList);

        //Method2
        swapElements2(strList, index1, index2);
        System.out.println(strList);
    }

    private static List<String> swapElements2(List<String> strList, int index1, int index2) {

        String element = strList.get(index1);
        strList.set(index1, strList.get(index2));
        strList.set(index2, element);

        return strList;
    }


    private static List<String> swapElements1(List<String> strList, int index1, int index2) {

        Collections.swap(strList, index1, index2);

        return strList;
    }

}
