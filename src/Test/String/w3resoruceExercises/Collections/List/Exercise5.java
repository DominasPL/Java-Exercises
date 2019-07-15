package Test.String.w3resoruceExercises.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercise5 {

    public static void main(String[] args) {

        //Write a Java program to shuffle elements in a array list
        // Write a Java program to reverse elements in a array list.

        List<String> strList = Exercise1.addStrElementsToArrayList(new ArrayList<>());

        //Shuffle elements first method
        List<String> shuffledListElements = shuffleListElements(strList);
        System.out.println(shuffledListElements);
        //Reverse elements first method
        List<String> reversedElements = reverseElements(shuffledListElements);
        System.out.println(reversedElements);

//      Shuffle elements second method
        List<String> shuffledListElements1 = shuffleListElements1(strList);
        System.out.println(shuffledListElements1);
        //Reverse elements second method
        List<String> reversedElements1 = reversedElements1(shuffledListElements1);
        System.out.println(reversedElements1);

    }

    private static List<String> reverseElements(List<String> strList) {

        Collections.reverse(strList);

        return strList;

    }


    private static List<String> reversedElements1(List<String> shuffledListElements1) {

        List<String> reversedList = new ArrayList<>();

        for (int i = shuffledListElements1.size() - 1; i >= 0 ; i--) {
            reversedList.add(shuffledListElements1.get(i));
        }

        return reversedList;
    }


    private static List<String> shuffleListElements(List<String> strList) {

        Collections.shuffle(strList);

        return strList;

    }

    private static List<String> shuffleListElements1(List<String> strList) {

        List<String> shuffledList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < strList.size(); i++) {

            int index = random.nextInt(strList.size());

            if (!shuffledList.contains(strList.get(index))) {
                shuffledList.add(strList.get(index));
            } else {
                i--;
            }

        }

        return shuffledList;

    }

}
