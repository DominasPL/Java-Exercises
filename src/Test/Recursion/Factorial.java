package Test.Recursion;

public class Factorial {

    public long countFactorial1(long number) {

        long factorial = 1L;

        for (int i = 2; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public long countFactorial2(long number) {

        if (number < 2)
            return 1;

        return number * countFactorial1(number - 1);

    }


}
