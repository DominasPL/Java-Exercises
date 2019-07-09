package Test.Tablice;

import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args) {

        Integer[] numbers = {50, 23, 15, 2, 40, 3, 1};


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 15) {
                System.out.println(i);
            }
        }

        System.out.println(Arrays.asList(numbers).indexOf(15));

    }

}
