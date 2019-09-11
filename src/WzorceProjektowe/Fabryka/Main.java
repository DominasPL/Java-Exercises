package WzorceProjektowe.Fabryka;

public class Main {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreator();

        Product product1 = creator.createProduct("product1");
        Product product2 = creator.createProduct("product2");

        System.out.println(product1.getName());
        System.out.println(product2.getName());

    }


}
