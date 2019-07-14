package Test.String.w3resoruceExercises.String;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        //Write a Java program to print list items containing all characters of a given word.
        List<String> items = getItemsList(new Scanner(System.in));
        String chars = "ar";

        getItemsContainingCharacters(items, chars);

    }

    private static List<String> getItemsList(Scanner scanner) {

        List<String> items = new LinkedList<>();
        String item;
        String choice;

        while (true) {

            System.out.print("Do you want to add an item (Y/N): ");
            choice = scanner.next();
            scanner.nextLine();

            if (choice.equals("y") || choice.equals("Y")) {

                System.out.print("Give an item name: ");

                if (scanner.hasNextLine()) {
                    item = scanner.nextLine();
                    items.add(item);
                } else {
                    System.out.println("Incorrect value. Try again!");
                }


            } else if (choice.equals("n") || choice.equals("N"))
                return items;

            else {
                System.out.println("Incorrect value. Try again!");
            }

        }


    }

    private static void getItemsContainingCharacters(List<String> items, String chars) {

        char[] charArray = chars.toCharArray();
        List<String> newItemList = new LinkedList<>();

        for (String str : items) {

            boolean appearInStr = true;
            for (int i = 0; i < charArray.length; i++) {

                if (str.indexOf(charArray[i]) < 0) {
                    appearInStr = false;
                }

            }

            if (appearInStr)
                newItemList.add(str);

        }

        newItemList.forEach(System.out::println);

    }





}
