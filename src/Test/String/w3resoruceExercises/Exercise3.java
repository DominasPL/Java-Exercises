package Test.String.w3resoruceExercises;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        //Write a Java program to concatenate a given string to the end of another string
        Scanner scanner = new Scanner(System.in);
        String str1 = Exercise1.getString(scanner);
        String str2 = Exercise1.getString(scanner);

//        String concatenatedStrings = concatStrings(str1, str2);
        String concatenatedStrings = concatStrings2(str1, str2);
        System.out.println(concatenatedStrings);
    }

    private static String concatStrings(String str1, String str2) {

        return str1.concat(str2);
    }

    public static String concatStrings2(String str1, String str2) {

        return str1 + str2;
    }

}
