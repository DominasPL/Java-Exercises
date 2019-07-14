package Test.String.w3resoruceExercises.String;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        //2. Write a Java program to get the character (Unicode code point) at the given index within the String.
        Scanner scanner = new Scanner(System.in);

        String userStr = Exercise1.getString(scanner);
        int strIndex = Exercise1.getIndex(scanner, userStr);

        int characterUnicode = getCharacterUnicode(userStr, strIndex);
        System.out.println(characterUnicode);

    }

    public static int getCharacterUnicode(String str, Integer index) {

        return (int) str.charAt(index);
    }





}
