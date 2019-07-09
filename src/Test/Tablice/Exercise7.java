package Test.Tablice;

import java.util.Arrays;

public class Exercise7 {

    public static void main(String[] args) {

        //1
        Integer[] tab1 = {1, 4, 6, 8, 10};
        Integer[] tab2 = {1, 2, 5, 10, 0};
//
//        Map<Integer, String> sameValues = new HashMap<>();
//
//        for (int i = 0; i < tab1.length ; i++) {
//
//            for (int j = 0; j < tab2.length ; j++) {
//
//                if (tab1[i].equals(tab2[j])) {
//                    sameValues.put(tab1[i], "tab1, tab2 contain this value!");
//                }
//
//            }
//
//        }
//
//        System.out.println(sameValues.toString());

        //2

        for (int i = 0; i < tab1.length ; i++) {

            if (Arrays.asList(tab2).contains(tab1[i])) {
                System.out.println("Two arrays have this value: " +tab1[i]);
            }

        }

    }

}
