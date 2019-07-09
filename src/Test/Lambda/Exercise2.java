package Test.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Exercise2 {

    public static void main(String[] args) {

        //1
        Scanner scanner = new Scanner(System.in);

        List<String> userStrs = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Please provide " + (i + 1) +" string: ");
            userStrs.add(scanner.nextLine());

        }

        userStrs.sort((s1, s2) -> s1.length() - s2.length());


        Consumer<String> consumer = System.out::println;
        userStrs.forEach(consumer);



    }


}
