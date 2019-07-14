package Test.String.w3resoruceExercises.String;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        //Write a Java program to check whether a given string starts with the contents of another string.

        String userStr = Exercise1.getString(new Scanner(System.in));
        String startStr = "Red";

        boolean value1 = checkIfStrStartsWith(userStr, startStr);
        System.out.println(value1);

        boolean value2 = checkIfStrStartsWith1(userStr, startStr);
        System.out.println(value2);

    }

    private static boolean checkIfStrStartsWith1(String userStr, String startStr) {

        char[] userCharArray = userStr.toCharArray();
        char[] startCharArray = startStr.toCharArray();

        boolean value = true;

        for (int i = 0; i < startCharArray.length ; i++) {

            if (!(startCharArray[i] == userCharArray[i])) {
                value = false;
                break;
            }

        }

        return value;
    }

    private static boolean checkIfStrStartsWith(String userStr, String startStr) {

        return userStr.startsWith(startStr);
    }


}
