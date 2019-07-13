package Test.String.w3resoruceExercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise12 {

    public static void main(String[] args) {

        //Write a Java program to print after removing duplicates from a given string

        String userStr = Exercise1.getString(new Scanner(System.in));
//
        String strWithoutDuplicates1 = removeDuplicates1(userStr);
        System.out.println(strWithoutDuplicates1);

        String strWithoutDuplicates2 = removeDuplicates2(userStr);
        System.out.println(strWithoutDuplicates2);
    }

    private static String removeDuplicates1(String userStr) {

        return Arrays.stream(userStr.split(""))
                .distinct()
                .collect(Collectors.joining());

    }

    private static String removeDuplicates2(String userStr) {

        Set<Character> charactersSet = new LinkedHashSet<>();

        for (Character character : userStr.toCharArray()) {
            charactersSet.add(character);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Character character : charactersSet) {
            stringBuilder.append(character);
        }


        return stringBuilder.toString();
    }





}
