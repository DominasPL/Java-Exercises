package Test.String.w3resoruceExercises;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        //Write a Java program to test if a given string contains the specified sequence of char values
        Scanner scanner = new Scanner(System.in);
        String userStr = Exercise1.getString(scanner);
        String charSequence = Exercise1.getString(scanner);

//        boolean result = checkStrContainsSequence(userStr, charSequence);
//        System.out.println(result);
//
        boolean result = checkStrContainsSequence2(userStr, charSequence);
        System.out.println(result);

    }

    //1
    private static boolean checkStrContainsSequence(String userStr, String charSequence) {

        return userStr.contains(charSequence);

    }

    //2
    private static boolean checkStrContainsSequence2(String userStr, String charSequence) {

        boolean isEqual = false;
        for (int i = 0; i < userStr.length() ; i++) {

            for (int j = 0; j < charSequence.length() ; j++) {

                if (userStr.charAt(j+i) != charSequence.charAt(j)) {
                    isEqual = false;
                    break;
                } else {
                    isEqual = true;
                }
            }

            if (isEqual)
                return true;

        }

        return isEqual;
    }


}
