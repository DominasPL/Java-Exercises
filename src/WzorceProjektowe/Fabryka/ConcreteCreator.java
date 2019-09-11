package WzorceProjektowe.Fabryka;

public class ConcreteCreator implements Creator {


    @Override
    public Product createProduct(String type) {

        Product product = null;

        if (type.equals("product1")) {
            product = new Product1();
        } else if (type.equals("product2")) {
            product = new Product2();
        }

        return product;
    }
}
