package Test.String.w3resoruceExercises.Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        //Write a Java program to insert an element into the array list at the first position.

        List<String> strElementList = addStrElementsToArrayList(new ArrayList<>());

        addElementAtFirstPosition(strElementList);

    }

    private static void addElementAtFirstPosition(List<String> strElementList) {

        strElementList.add(0,"Pineapple");
        System.out.println(strElementList);

    }

    public static List<String> addStrElementsToArrayList(List<String> elementList) {

        Scanner scanner = new Scanner(System.in);
        String element;
        String answer;

        while (true) {

            System.out.print("Do you want to add a new element? (Y/N): ");
            answer = scanner.nextLine();

            if (answer.equals("y") || answer.equals("Y")) {

                System.out.print("Element name: ");

                if (scanner.hasNextLine()) {
                    element = scanner.nextLine();
                    elementList.add(element);
                }

            } else if (answer.equals("n") || answer.equals("N"))
                break;
            else
                System.out.println("Incorrect value! Try again.");

        }

        return elementList;

    }


}
