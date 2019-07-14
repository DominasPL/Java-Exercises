package Test.String.w3resoruceExercises;

import java.util.Collections;
import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        //Write a Java program to repeat every character twice in the original string.

        String userStr = Exercise1.getString(new Scanner(System.in));

        String newStr = duplicateStrCharacters(userStr);
        System.out.println(newStr);



    }

    private static String duplicateStrCharacters(String userStr) {

        char[] charArray = userStr.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {

            String duplicatedCharStr = Character.toString(charArray[i]);
            stringBuilder.append(duplicatedCharStr);
            stringBuilder.append(duplicatedCharStr);

        }

        return stringBuilder.toString();

    }

//
//    private static String duplicateStrCharacters2(String userStr) {
//
//        String duplicateCharsStr = String.join("", Collections.nCopies(2, userStr));
//
//        return duplicateCharsStr;
//    }


}
