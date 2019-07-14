package Test.String.w3resoruceExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14 {


    public static void main(String[] args) {

        //Write a Java program to remove "b" and "ac" from a given string.

        String userStr = Exercise1.getString(new Scanner(System.in));

        String newStr = removeCharacters(userStr);
        System.out.println(newStr);



    }

    private static String removeCharacters(String userStr) {

        return userStr.replace("ac", "").replace("b", "");
    }


}
