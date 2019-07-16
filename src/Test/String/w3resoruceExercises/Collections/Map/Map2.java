package Test.String.w3resoruceExercises.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map2 {

    public static void main(String[] args) {

        // Write a Java program to copy all of the mappings from the specified map to another map.

        Map<String, Integer> map = Map1.createMap(new HashMap<>(), new Scanner(System.in));

        copyValuesFromMap(map);

    }

    private static Map<String,Integer> copyValuesFromMap(HashMap<String, Integer> map) {

        Map<String,Integer> copiedMap = new HashMap<>()


    }

}
