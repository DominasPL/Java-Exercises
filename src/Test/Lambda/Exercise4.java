package Test.Lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Exercise4 {

    public static void main(String[] args) {


        //Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::).

        BiFunction<Integer, String, Human> humanConstructor = Human::new;
        Human human = humanConstructor.apply(10, "Dominik");
        System.out.println(human.getAge());
        System.out.println(human.getName());

//        BiConsumer<Double, Double> doubleBiConsumer = (d1, d2) -> System.out.println(d1 * d2);
//
//        doubleBiConsumer.accept(4d, 5d);


    }


}
