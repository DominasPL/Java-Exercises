package Test.String.w3resoruceExercises.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map1 {

    public static void main(String[] args) {

        //Write a Java program to count the number of key-value (size) mappings in a map.

        Map<String, Integer> map = createMap(new HashMap<>(), new Scanner(System.in));

        int mapSize = countMapSize(map);
        System.out.println(mapSize);

    }

    private static int countMapSize(Map<String, Integer> map) {

        return map.size();
    }

    public static Map<String,Integer> createMap(Map<String, Integer> stringIntegerHashMap, Scanner scanner) {

        String key;
        String answer;
        int value;

        while (true) {

            System.out.print("Do you want to add new key with value (y/n): ");
            answer = scanner.nextLine();

            if (answer.equals("y") || answer.equals("Y")) {

                System.out.print("Give a key: ");
                key = scanner.nextLine();

                System.out.print("Give a value (int): ");
                while (!scanner.hasNextInt()){
                    System.out.print("Incorrect value. Try again: ");
                }

                value = scanner.nextInt();
                scanner.nextLine();
                stringIntegerHashMap.put(key, value);

            } else if (answer.equals("n") || answer.equals("N"))
                break;
            else
                System.out.println("Incorrect value!");

        }

        return stringIntegerHashMap;

    }

}
