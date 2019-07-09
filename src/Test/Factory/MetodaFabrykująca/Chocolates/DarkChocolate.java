package Test.Factory.MetodaFabrykująca.Chocolates;

public class DarkChocolate extends Chocolate {

    public DarkChocolate() {
        setName("Dark Chocolate");
    }

    @Override
    public void addThings() {
        System.out.println("Adding some nuts to Dark Chocolate!");
    }
}
