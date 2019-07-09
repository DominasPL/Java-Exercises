package Test.Tablice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {

        Integer[] numbers = {50, 23, 15, 2, 40, 3, 1};

//        int[] newArray = new int[numbers.length - 1];
//
//        int newArrayIndex = 0;
//
//        for (int i = 0; i < numbers.length ; i++) {
//
//            if (numbers[i] != 15){
//                newArray[newArrayIndex] = numbers[i];
//                newArrayIndex++;
//            }
//
//        }
//
//        for (int value : newArray) {
//            System.out.println(value);
//        }


        List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        Iterator<Integer> i = numberList.iterator();

        while(i.hasNext()) {

            Integer value = i.next();
            if (value == 15) {
                i.remove();
            }
        }

        System.out.println(numberList);

    }

}
