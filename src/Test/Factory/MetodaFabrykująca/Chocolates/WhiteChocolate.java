package Test.Factory.MetodaFabrykująca.Chocolates;

public class WhiteChocolate extends Chocolate {

    public WhiteChocolate() {
        setName("White Chocolate");
    }


    @Override
    public void addThings() {
        System.out.println("Adding sweets to White Chocolate!");
    }
}
