package Test.String.w3resoruceExercises.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise8 {

    public static void main(String[] args) {

        //Write a Java program to empty an array list.

        List<String> strList = Exercise1.addStrElementsToArrayList(new ArrayList<>());

        System.out.println(strList);

//        removeAllListElements1(strList);
//        System.out.println(strList);

        removeAllListElements2(strList);
        System.out.println(strList);
    }

    private static void removeAllListElements2(List<String> strList) {

        strList.removeAll(strList);

    }

    private static void removeAllListElements1(List<String> strList) {

        strList.clear();

    }

}
