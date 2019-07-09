package Test.Tablice;

import java.util.Arrays;

public class Sortowanie {

    public static void main(String[] args) {

        int[] numbers = {50, 23, 15, 2, 40, 3, 1};
//        int value;
//
//        for (int i = 0; i < numbers.length - 1; i++) {
//
//            for (int j = 0; j < numbers.length - 1; j++) {
//
//                if (numbers[j] > numbers[j + 1]) {
//                    value = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = value;
//                }
//
//            }
//
//        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

    }


}

