package WzorceProjektowe.Factory;

public class MeatCreator extends Creator {

    @Override
    public Product createProduct(String type) {

        Product product = null;

        if (type.equals("sausage")) {
            product = new Sausage();
        } else if (type.equals("ham")) {
            product = new Ham();
        }

        return product;

    }
}
