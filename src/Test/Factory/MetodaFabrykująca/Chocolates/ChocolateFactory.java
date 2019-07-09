package Test.Factory.MetodaFabrykująca.Chocolates;

public class ChocolateFactory {

    public Chocolate createChocolate(String type) {



        Chocolate chocolate = null;

        if (type.equals("White")) {
            chocolate = new WhiteChocolate();

        } else if (type.equals("Dark")) {
            chocolate = new DarkChocolate();

        } else if (type.equals("Nuts")) {
            chocolate = new NutsChocolate();
        }

        return chocolate;

    }


}
