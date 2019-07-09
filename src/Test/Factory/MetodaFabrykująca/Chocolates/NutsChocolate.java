package Test.Factory.MetodaFabrykująca.Chocolates;

public class NutsChocolate extends Chocolate {

    public NutsChocolate() {
        setName("Nuts Chocolate");
    }

    @Override
    public void addThings() {
        System.out.println("Adding cookies to Nuts Chocolate!");
    }
}
