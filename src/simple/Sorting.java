package simple;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sorting {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            nums.add(random.nextInt(100) + 1);
//            System.out.print(nums.get(i) + " ");
        }
//        System.out.println();

//        List<Integer> sortedList = bubbleSort(nums);
//        sortedList.forEach(n -> System.out.print(n + " "));

        long start = System.currentTimeMillis();
//        bubbleSort(nums);
//        quickSort(nums);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    public static List<Integer> bubbleSort(List<Integer> nums) {


        Integer temp;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size() - 1 - i; j++) {
                if (nums.get(j) > nums.get(j+1)) {
                    temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }
            }
        }

        return nums;
    }

    public static List<Integer> quickSort(List<Integer> nums) {

        if (nums.size() <= 1) {
            return nums;
        }

        List<Integer> result = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        List<Integer> smaller = new ArrayList<>();
        Integer pivot = nums.remove(nums.size()/2);

        for (Integer num : nums) {
            if (num <= pivot) {
                smaller.add(num);
            } else {
                bigger.add(num);
            }
        }

        smaller = quickSort(smaller);
        bigger = quickSort(bigger);
        result.addAll(smaller);
        result.add(pivot);
        result.addAll(bigger);


        return result;
    }

}
