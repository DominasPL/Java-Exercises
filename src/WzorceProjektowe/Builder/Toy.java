package WzorceProjektowe.Builder;

public class Toy {

    private String name;
    private int amount;

    public Toy(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
