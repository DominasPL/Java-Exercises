package Test.Factory.MetodaFabrykująca.Chocolates;

import java.util.Scanner;

public class ChocolateTesting {


    public static void main(String[] args) {

        ChocolateFactory chocolateFactory = new ChocolateFactory();

        Chocolate chocolate = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Which type of chocolate (White / Dark / Nuts)");
        System.out.print("Give chocolate type: ");

        String chocolateType = "";

        if (userInput.hasNextLine()) {
            chocolateType = userInput.nextLine();
        }

        chocolate = chocolateFactory.createChocolate(chocolateType);

        if (chocolate != null) {
            String name = chocolate.getName();
            System.out.println("This is " + name);
            chocolate.addThings();
        }


    }


}
