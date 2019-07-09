package Test.Tablice;

public class Main {

    public static void main(String[] args) {


        Integer[] numbers = {1, 2, 3, 4, 5, 6};

        //1 sposob
//        ArrayUtils.reverse(numbers);
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }

        //2 sposob

//        List<Integer> numberList = Arrays.asList(numbers);
//        Collections.reverse(numberList);
//
//        Integer[] reversedArray = numberList.toArray(numbers);
//
//        for (int i = 0; i < reversedArray.length; i++) {
//            System.out.print(reversedArray[i] + " ");
//        }

        //3 sposob

        Integer value;

        for (int i = 0; i < numbers.length / 2; i++) {

            value = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = value;

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }

}
