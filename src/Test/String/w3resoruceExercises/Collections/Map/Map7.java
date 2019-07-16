package Test.String.w3resoruceExercises.Collections.Map;

import java.util.*;

public class Map7 {

    public static void main(String[] args) {

        //Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.

        Map<String, Integer> map = Map1.createMap(new TreeMap<>(), new Scanner(System.in));

        Map<String, Integer> greatestAndLeastValue = findGreatestAndLeastValue(map);
        System.out.println(greatestAndLeastValue);

        Map<String, Integer> greatestAndLeastValue1 = findGreatestAndLeastValue1(map);
        System.out.println(greatestAndLeastValue1);


    }

    private static Map<String, Integer> findGreatestAndLeastValue1(Map<String, Integer> map) {

        Map<String, Integer> maxAndMinMap = new TreeMap<>();

        Map.Entry<String, Integer> min = Collections.min(map.entrySet(), Map.Entry.comparingByValue());
        Map.Entry<String, Integer> max = Collections.max(map.entrySet(), Map.Entry.comparingByValue());

        maxAndMinMap.put(min.getKey(), min.getValue());
        maxAndMinMap.put(max.getKey(), max.getValue());

        return maxAndMinMap;

    }


    private static Map<String, Integer> findGreatestAndLeastValue(Map<String, Integer> map) {

        Map<String, Integer> minMaxMap = new TreeMap<>();

        int max = Integer.MIN_VALUE;
        String keyMax = null;

        int min = Integer.MAX_VALUE;
        String keyMin = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                keyMax = entry.getKey();
            }

            if (min > entry.getValue()) {
                min = entry.getValue();
                keyMin = entry.getKey();
            }
        }

        minMaxMap.put(keyMin, min);
        minMaxMap.put(keyMax, max);

        return minMaxMap;
    }

}
