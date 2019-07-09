package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "c"));

        int size = list.size();

        for (int i = 0; i < size; i++) {

            list.remove(0);

        }

        System.out.println(list);


    }

}
