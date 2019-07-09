package Test.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        List<String> listOfNames = Arrays.asList("Dominik", "Adam", "Marzena", "Albert", "Diego");

//        Collections.sort(listOfNames, (String s1, String s2) -> s1.compareToIgnoreCase(s2));


        listOfNames.sort((String s1, String s2) -> s1.compareToIgnoreCase(s2));

        System.out.println(listOfNames);
//
//        Consumer<String> consumer = s -> System.out.println(s);
//
//        consumer.accept("Dupa");
//
//        Predicate<String> str = s -> s.length() == 5;
//
//        System.out.println(str.test("DUPAKaaaa"));
//
//
//        UnaryOperator<Integer> multiply = x -> x * x;
//
//        System.out.println(multiply.apply(55));
//
//
//        Supplier<String> returnStr = () -> "Hello world";
//
//        System.out.println(returnStr.get());

//
//        Function<Integer, Long> multiply = x -> {
//
//            if (x != 0 && x > 2) {
//                return (long)x * x;
//            } else {
//                return 123L;
//            }
//        };
//
//        System.out.println(multiply.apply(23));

        Consumer<List<String>> listConsumer = Test::showElements;
        listConsumer.accept(listOfNames);

    }

    public static void showElements(List<String> stringList) {

        stringList.forEach(System.out::println);

    }


}
