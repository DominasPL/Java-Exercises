package Test.String.w3resoruceExercises.Collections.Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map5 {

    public static void main(String[] args) {

        // Write a Java program to test if a map contains a mapping for the specified value.
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = Map1.createMap(new HashMap<>(), scanner);

        int value = getMapValue(scanner);

        boolean result = checkMapContainsValue(map, value);
        System.out.println(result);
        boolean result2 = checkMapContainsValue1(map, value);
        System.out.println(result2);

    }

    private static boolean checkMapContainsValue1(Map<String, Integer> map, int value) {

        Iterator<Integer> it = map.values().iterator();

        while (it.hasNext()) {
            Integer next = it.next();
            if (next.equals(value))
                return true;
        }

        return false;
    }

    private static boolean checkMapContainsValue(Map<String, Integer> map, int value) {

        return map.containsValue(value);
    }

    private static int getMapValue(Scanner scanner) {

        System.out.print("Give a value: ");

        while (!scanner.hasNextInt())
            scanner.nextLine();

        return scanner.nextInt();

    }

}
