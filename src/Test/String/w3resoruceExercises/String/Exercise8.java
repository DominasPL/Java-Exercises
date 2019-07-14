package Test.String.w3resoruceExercises.String;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        //Write a Java program to replace all the 'd' characters with 'f' characters.

        String userStr = Exercise1.getString(new Scanner(System.in));

//        String replacedCharStr = replaceLetters(userStr);
//        System.out.println(replacedCharStr);

        String replacedCharStr = replaceLetters1(userStr);
        System.out.println(replacedCharStr);
    }

    private static String replaceLetters1(String userStr) {

        char[] charArray = userStr.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length ; i++) {

            if (charArray[i] == 'd')
                charArray[i] = 'f';

        }

        return String.valueOf(charArray);

    }

    private static String replaceLetters(String userStr) {


        return userStr.toLowerCase().replaceAll("d", "f");
    }


}
