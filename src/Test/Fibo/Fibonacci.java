package Test.Fibo;

public class Fibonacci {

    public static int n1 = 0;
    public static int n2 = 1;
    public static int n3;

//    public static void getFibonacci(int number) {
//
//        if (number <= 0 || number == 1) {
//            throw new IllegalArgumentException("Number must be greater than 1");
//        }
//
//        System.out.println(n1);
//        System.out.println(n2);
//
//        for (int i = 2; i < number; i++) {
//            n3 = n1 + n2;
//            System.out.println(n3);
//            n1 = n2;
//            n2 = n3;
//        }
//    }

    public static void getFibonacci2(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            getFibonacci2(count-1);
        }
    }

    public static void getFirstFiboNumbers() {
        System.out.println(n1);
        System.out.println(n2);
    }

}
