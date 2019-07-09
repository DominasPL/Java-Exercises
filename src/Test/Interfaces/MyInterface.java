package Test.Interfaces;

public interface MyInterface {

    void getAmount();

    default void sayHello() {
        System.out.println("Hello!");
    }

}
