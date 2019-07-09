package Test.Lambda;

import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise3 {

    public static void main(String[] args) {

        //Napisz program, który wywoła funkcję equals na instancji klasy Object używając mechanizmu odwoływania się do metody (przy pomocy ::).
        Supplier<Object> objectSupplier = Object::new;
        objectSupplier.get();

        Predicate<Object> objectPredicate = o -> o.equals(objectSupplier.get());
        System.out.println(objectPredicate.test(objectSupplier.get()));


    }

}
