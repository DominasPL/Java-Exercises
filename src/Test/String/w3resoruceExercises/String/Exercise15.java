package Test.String.w3resoruceExercises.String;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        //Write a Java program to return true from a given string if the first two characters in the string also appear at the end

        String userStr = Exercise1.getString(new Scanner(System.in));
        String startEnd = "ed";

//        boolean result = checkStrStartEqualsEnd(userStr, startEnd);
//        System.out.println(result);

        boolean result1 = checkStrStartEqualsEnd1(userStr, startEnd);
        System.out.println(result1);

    }

    private static boolean checkStrStartEqualsEnd(String userStr, String startEnd) {

        return userStr.startsWith(startEnd) && userStr.endsWith(startEnd);
    }

    private static boolean checkStrStartEqualsEnd1(String userStr, String startEnd) {

        char[] userCharArray = userStr.toCharArray();
        char[] patternCharArray = startEnd.toCharArray();

        boolean startEndResult = true;

        for (int j = 0; j < patternCharArray.length; j++) {

            if (userCharArray[j] != patternCharArray[j])
                startEndResult = false;
            else if (userCharArray[userCharArray.length - 1 -j] != patternCharArray[patternCharArray.length - 1 - j])
                startEndResult = false;


        }

        return startEndResult;
    }


}
