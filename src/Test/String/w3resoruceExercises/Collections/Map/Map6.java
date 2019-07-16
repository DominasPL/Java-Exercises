package Test.String.w3resoruceExercises.Collections.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Map6 {

    public static void main(String[] args) {

        // Write a Java program to sort keys in Tree Map by using comparator.

        Map<String, Integer> map = Map1.createMap(new TreeMap<>(), new Scanner(System.in));

        //TreeMap cant have key = null but can have many null values
        //TreeMap is sorted naturally by keys by implementing Comparable interface
        sortMapKeys(map);


    }

    private static void sortMapKeys(Map<String, Integer> map) {
        System.out.println(map);

    }

}
