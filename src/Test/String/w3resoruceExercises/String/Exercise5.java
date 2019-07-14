package Test.String.w3resoruceExercises.String;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        //Write a Java program to compare a given string to the specified string buffer.
        Scanner scanner = new Scanner(System.in);
        String userStr = Exercise1.getString(scanner);

        StringBuffer stringBuffer = new StringBuffer("StringBufferExample");

        System.out.println(userStr.equals(stringBuffer.toString()));

    }

    public static boolean checkStringsEquality(String str, StringBuffer stringBuffer) {

        return str.equals(stringBuffer.toString());

    }





}
