package Test.Factory.MetodaFabrykująca.Chocolates;

public abstract class Chocolate {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addThings();



}
