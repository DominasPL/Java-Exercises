package Test.String.w3resoruceExercises.Collections.Map;

import Test.Testy.PetRock;

import java.util.*;

public class Map8 {

    public static void main(String[] args) {

        //Write a Java program to get a reverse order view of the keys contained in a given map.

        Map<String, Integer> map = Map1.createMap(new TreeMap<>(), new Scanner(System.in));
        System.out.println(map);

        Map<String, Integer> reversedMapByKeys = reverseMapKeys(map);
        System.out.println(reversedMapByKeys);

//        Map<String, Integer> reversedMapByKeys1 = reverseMapKeys1(map);
//        System.out.println(reversedMapByKeys1);


    }

    private static Map<String, Integer> reverseMapKeys1(Map<String, Integer> map) {

        Map<String, Integer> reversedMap = new TreeMap<>(Collections.reverseOrder());

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> next = it.next();
            reversedMap.put(next.getKey(), next.getValue());
        }

        return reversedMap;

    }


    private static Map<String, Integer> reverseMapKeys(Map<String, Integer> map) {

        Map<String, Integer> reversedMap = new LinkedHashMap<>();

        List<String> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());

        for (int i = keys.size() - 1; i >= 0; i--) {
            reversedMap.put(keys.get(i), values.get(i));
        }

        return reversedMap;
    }

}
