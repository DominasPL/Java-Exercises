package Test;

public abstract class Parent {


    private String name;
    private int age;
    private double weight;

    /**
     * Nazwyam zwierzę
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Starzeje się, więc mój wiek wzrasta...
     */
    public void growOld(int age) {
        this.age += age;
    }

    /**
     * Jem więc staję się cięższy
     */
    public void eat(double weight) {
        this.weight += 3/4 * weight;
    }

}
