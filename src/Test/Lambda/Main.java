package Test.Lambda;

public class Main {

    public static void main(String[] args) {

        Calculator sum = (int a, int b) -> a + b;
        Calculator subtract = (int a, int b) -> a - b;
        Calculator multiply = (int a, int b) -> a * b;
        Calculator divide = (int a, int b) -> a / b;

        System.out.println(sum.calculate(2,2));
        System.out.println(subtract.calculate(2,2));
        System.out.println(multiply.calculate(2,2));
        System.out.println(divide.calculate(2,2));

    }


}
