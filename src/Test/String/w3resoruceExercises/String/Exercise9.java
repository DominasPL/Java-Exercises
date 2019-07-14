package Test.String.w3resoruceExercises.String;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        String userStr = Exercise1.getString(new Scanner(System.in));
        String toReplace = "cat";
        String replacement = "dog";

        String newStr = replaceLetters(userStr, toReplace, replacement);
        System.out.println(newStr);

    }

    private static String replaceLetters(String userStr, String toReplace, String replacement) {

        return userStr.toLowerCase().replaceAll(toReplace, replacement);

    }


}
