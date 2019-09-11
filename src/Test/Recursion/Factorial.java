package Test.Recursion;

public class Factorial {

    public int countFactorial1(int number) {

        int result = 1;

        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public int countFactorial2(int number) {

        if (number == 0) {
            return 1;
        }

        return number * countFactorial2(number - 1);
    }

}
