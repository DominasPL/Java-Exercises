package Test.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercise {

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(1, 5, 7, 10, 5);

//        Consumer<List<Integer>> listConsumer = s -> System.out.println(s);
//        listConsumer.accept(integerList);

        Consumer<Integer> consumer = System.out::println;
        integerList.forEach(consumer);




    }


}
