package Test.Sortowanie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {8, 4, 44, 22, 5, 1};
        int[] sortedTab = BubbleSort.sort(numbers);

        System.out.println(Arrays.toString(sortedTab));


    }

}
