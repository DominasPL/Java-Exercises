package Test.String.w3resoruceExercises.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map4 {

    public static void main(String[] args) {

        //Write a Java program to test if a map contains a mapping for the specified key.

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = Map1.createMap(new HashMap<>(), scanner);
        String key = getKey(scanner);

        boolean result1 = checkMapContainsKey(map, key);
        System.out.println(result1);
        boolean result2 = checkMapContainsKey1(map, key);
        System.out.println(result2);

    }

    private static boolean checkMapContainsKey1(Map<String, Integer> map, String key) {

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(key))
                return true;
        }

        return false;
    }

    private static boolean checkMapContainsKey(Map<String, Integer> map, String key) {
        return map.containsKey(key);
    }

    private static String getKey(Scanner scanner) {

        System.out.println("Give a key: ");

        return scanner.nextLine();
    }

}
