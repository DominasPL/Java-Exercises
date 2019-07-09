package Test.Tablice;

import java.util.HashMap;
import java.util.Map;

public class Exercise6 {

    public static void main(String[] args) {


        Integer[] numbers = {50, 23, 15, 2, 40, 3, 1, 23, 15, 20, 30, 23, 23, 15, 15};


        Map<Integer, Integer> allNumbers = new HashMap<>();

        for (Integer number : numbers) {

            if (!allNumbers.containsKey(number)) {
                allNumbers.put(number, 1);
            } else {
                allNumbers.put(number, allNumbers.get(number) + 1);
            }

        }

        System.out.println(allNumbers.toString());

    }


}
