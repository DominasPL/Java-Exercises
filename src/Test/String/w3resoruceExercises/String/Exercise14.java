package Test.String.w3resoruceExercises.String;

import java.util.Scanner;

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
