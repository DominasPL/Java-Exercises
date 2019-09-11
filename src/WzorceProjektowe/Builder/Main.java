package WzorceProjektowe.Builder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog.Builder()
                .name("Barry")
                .description("Dogs are angry!")
                .food(new Food("Sausage"))
                .food(new Food("Watermelon"))
                .toys(new Toy("Ball", 5))
                .toys(new Toy("Bone", 10))
                .toys(new Toy("ToyBear", 5))
                .bornDate(LocalDate.now())
                .isAlive()
                .build();

        System.out.println(dog.getName());
        System.out.println(dog.getDescription());
        System.out.println(dog.getFoodList().toString());
        System.out.println(dog.getToysList());
        System.out.println(dog.getBornDate());
        System.out.println(dog.isAlive());

    }


}
