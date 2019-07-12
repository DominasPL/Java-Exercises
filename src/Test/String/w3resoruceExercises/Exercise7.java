package Test.String.w3resoruceExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        //Write a Java program to find whether a region in the current string matches a region in another string
        Scanner scanner = new Scanner(System.in);
        String str1 = Exercise1.getString(scanner);
        String str2 = Exercise1.getString(scanner);

        int[] rangeStr1 = getRange(scanner, str1);
        int[] rangeStr2 = getRange(scanner, str2);

//        Arrays.stream(range)
//                .forEach(System.out::println);

        boolean value = checkStringRangeEquality(str1, str2, rangeStr1, rangeStr2);
        System.out.println("Strings are equal: " + value);


    }

    private static boolean checkStringRangeEquality(String str1, String str2, int[] rangeStr1, int[] rangeStr2) {

        String substring1 = str1.substring(rangeStr1[0], rangeStr1[1]);
        String substring2 = str2.substring(rangeStr2[0], rangeStr2[1]);

        return substring1.equals(substring2);
    }


    public static int[] getRange(Scanner scanner, String str) {

        int[] range = new int[2];


        while (true) {

            System.out.print("Give start value: ");
            while(!scanner.hasNextInt()) {
                System.out.print("Incorrect value. Try again: ");
                scanner.nextLine();
            }

            range[0] = scanner.nextInt();

            System.out.print("Give end value: ");

            while(!scanner.hasNextInt()) {
                System.out.print("Incorrect value. Try again: ");
                scanner.nextLine();
            }

            range[1] = scanner.nextInt();

            if (range[0] > range[1])
                System.out.println("Incorrect values!");
            else if (range[0] < 0)
                System.out.println("Incorrect values!");
            else if (range[0] > str.length() - 1 || range[1] > str.length() - 1)
                System.out.println("Incorrect values!");
            else
                break;
        }

        return range;

    }

}
