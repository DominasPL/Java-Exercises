package Test.Tablice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise8 {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("Dominik", "Adam", "Marek"));
//
        //1
//        String[] strings = new String[strList.size()];
//        strList.toArray(strings);
//
//        for (String str : strings) {
//            System.out.println(str);
//        }


        //2

        String[] strings = new String[strList.size()];

        for (int i = 0; i < strings.length ; i++) {

            strings[i] = strList.get(i);

        }

        for (String str : strings) {
            System.out.println(str);
        }


    }

}
