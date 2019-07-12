package Test.String.w3resoruceExercises;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {

        //1. Write a Java program to get the character at the given index within the String.
        Scanner scanner = new Scanner(System.in);
        String str = getString(scanner);
        Integer index = getIndex(scanner, str);

        char character = findLetter(str, index);
        System.out.println(character);
    }


    public static char findLetter(String str, Integer index) {

        System.out.println(str);
        return str.charAt(index);

    }


    public static String getString(Scanner scanner) {

        String userString = "";

        while (userString.equals("")) {

            System.out.print("Give a string: ");

            if (scanner.hasNextLine())
                userString = scanner.nextLine();
        }

        return userString;

    }

    public static Integer getIndex(Scanner scanner, String str) {

        Integer strIndex;


        while (true) {

            System.out.print("Give an index: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Incorrect value. Try again: ");
                scanner.nextLine();
            }

            strIndex = scanner.nextInt();

            if (strIndex > str.length() - 1 || strIndex < 0) {
                System.out.println("Incorrect index!");
            } else {
                break;
            }

        }

        return strIndex;


    }
}
