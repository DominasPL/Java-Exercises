package Test.String.w3resoruceExercises.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {

    public static void main(String[] args) {

        //Write a Java program to compare two array lists.

        List<String> strList1 = Exercise1.addStrElementsToArrayList(new ArrayList<>());
        List<String> strList2 = Exercise1.addStrElementsToArrayList(new ArrayList<>());


        boolean result1 = compareLists1(strList1, strList2);
        System.out.println(result1);

        boolean result2 = compareLists2(strList1, strList2);
        System.out.println(result2);


    }

    private static boolean compareLists2(List<String> strList1, List<String> strList2) {

        if (strList1.size() != strList2.size())
            return false;

        return strList1.equals(strList2);

    }

    private static boolean compareLists1(List<String> strList1, List<String> strList2) {

        boolean result = true;

        if (strList1.size() == strList2.size()) {
            for (int i = 0; i < strList1.size(); i++) {

                if (!strList1.get(i).equals(strList2.get(i))) {
                    result = false;
                }
            }
        } else
            return false;

        return result;
    }
}
