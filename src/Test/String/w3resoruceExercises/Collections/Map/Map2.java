package Test.String.w3resoruceExercises.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map2 {

    public static void main(String[] args) {

        // Write a Java program to copy all of the mappings from the specified map to another map.

        Map<String, Integer> map = Map1.createMap(new HashMap<>(), new Scanner(System.in));

        Map<String, Integer> copiedMap1 = copyValuesFromMap(map);
        Map<String, Integer> copiedMap2 = copyValuesFromMap1(map);

        System.out.println(copiedMap1);
        System.out.println(copiedMap2);
    }

    private static Map<String, Integer> copyValuesFromMap1(Map<String, Integer> map) {

        Map<String, Integer> copiedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            copiedMap.put(entry.getKey(), entry.getValue());
        }

//        Iterator it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry next = (Map.Entry) it.next();
//            copiedMap.put((String)next.getKey(), (Integer)next.getValue());
//        }

        return copiedMap;
    
    }


    private static Map<String,Integer> copyValuesFromMap(Map<String, Integer> map) {

        return new HashMap<>(map);
    }

}
