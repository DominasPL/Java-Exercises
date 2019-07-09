package Test.Tablice;

import java.util.ArrayList;
import java.util.List;

public class Exercise10 {


    public static void main(String[] args) {

        int[] tab1 = {4, 90, 10, 25, 14, 23};
        boolean isGreater = true;

        List<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < tab1.length ; i++) {
            int value = tab1[i];
            isGreater = true;

            for (int j = i + 1; j <tab1.length; j++) {

                if (value > tab1[j]) {
                    System.out.println(tab1[i] + " jest większa od " + tab1[j]);
                } else {
                    isGreater = false;
                    break;
                }
            }

            if (isGreater)
                leaders.add(value);

        }

        System.out.println(leaders);


    }


}
