package Test.String.w3resoruceExercises.Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        // Write a Java program to update specific list element by given element.

        List<String> elements = Exercise1.addStrElementsToArrayList(new ArrayList<>());

        String givenElement = "Pineapple";
        int index = getIndex(elements, new Scanner(System.in));

        List<String> newStrList = updateListElement(elements, givenElement, index);
        System.out.println(newStrList);

        List<String> newStrList1 = updateListElement1(elements, givenElement, index);
        System.out.println(newStrList1);

    }

    private static List<String> updateListElement(List<String> elements, String givenElement, int index) {

        elements.remove(index);
        elements.add(index, givenElement);

        return elements;
    }

    private static List<String> updateListElement1(List<String> elements, String givenElement, int index) {

        elements.set(index, givenElement);

        return elements;
    }


    public static int getIndex(List<String> elements, Scanner scanner) {

        int index = 0;

        while (true) {

            System.out.print("Give an index: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Incorrect value! Try again: ");
                scanner.hasNextLine();
            }

            index = scanner.nextInt();

            if (index > elements.size())
                System.out.println("Incorrect value. Index cant be greater than list size!");
            else if (index < 0)
                System.out.println("Incorrect value. Index cant be less than 0");
            else {
                break;
            }

        }

        return index;

    }


}
