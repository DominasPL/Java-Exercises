package Test.String.w3resoruceExercises.String;

import java.util.*;

public class Exercise11 {

    public static void main(String[] args) {

        //Write a Java program to find the second most frequent character in a given string.

        String userStr = Exercise1.getString(new Scanner(System.in));

        Map<Character, Integer> charMap = createCharMap(userStr);

        findSecondMostFrequentChar(charMap);

    }

    private static Map<Character, Integer> createCharMap(String userStr) {

        Map<Character, Integer> charsOccurances = new HashMap<>();

        for (Character character : userStr.toLowerCase().toCharArray()) {

            if (!charsOccurances.containsKey(character))
                charsOccurances.put(character, 1);
            else {
                Integer value = charsOccurances.get(character);
                charsOccurances.put(character, value + 1);
            }
        }

        return charsOccurances;
    }

    private static void findSecondMostFrequentChar(Map<Character, Integer> charMap) {

        Set<Integer> occurances = new TreeSet<>();

        for (Character character : charMap.keySet()) {
            occurances.add(charMap.get(character));
        }

        List<Integer> occurancesList = new ArrayList<>(occurances);

        Integer secondMostFrequentValue = occurancesList.get(occurances.size() - 2);

        List<Character> secondMostFrequentChars = new LinkedList<>();

        for (Character character : charMap.keySet()) {

            if (charMap.get(character).equals(secondMostFrequentValue))
                secondMostFrequentChars.add(character);
        }

        System.out.println("Second most frequent chars in your string are: " + secondMostFrequentChars);

    }



}
