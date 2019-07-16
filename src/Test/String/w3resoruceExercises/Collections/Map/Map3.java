package Test.String.w3resoruceExercises.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map3 {

    public static void main(String[] args) {

        //Write a Java program to remove all of the mappings from a map

        Map<String, Integer> map = Map1.createMap(new HashMap<>(), new Scanner(System.in));

//        clearMap(map);
        clearMap1(map);
    }

    private static void clearMap1(Map<String, Integer> map) {
//
//        Iterator it = map.keySet().iterator();
//
//        while (it.hasNext()) {
//            it.next();
//            it.remove();
//        }

//
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            it.next();
            it.remove();
        }

        System.out.println(map);
    }


    private static void clearMap(Map<String, Integer> map) {

        map.clear();
    }

}
