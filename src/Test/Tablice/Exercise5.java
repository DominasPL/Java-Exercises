package Test.Tablice;

import java.util.Arrays;
import java.util.Collections;

public class Exercise5 {

    public static void main(String[] args) {


        Integer[] numbers = {50, 23, 15, 2, 40, 3, 1};

        //1

//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (Integer number : numbers) {
//
//            if (number < min) {
//                min = number;
//            }
//
//            if (number > max) {
//                max = number;
//            }
//
//        }
//
//
//        System.out.println("Max = " + max);
//        System.out.println("Min = " + min);

        //2
        System.out.println(Collections.min(Arrays.asList(numbers)));
        System.out.println(Collections.max(Arrays.asList(numbers)));


        //3
        Arrays.sort(numbers);
        System.out.println("Min: " + numbers[0]);
        System.out.println("Max: " + numbers[numbers.length - 1]);



    }

}
