package WzorceProjektowe.Factory;

public class FruitsCreator extends Creator {

    @Override
    Product createProduct(String type) {

        Product product = null;

        if (type.equals("watermelon")) {
            product = new Watermelon();
        } else if (type.equals("apple")) {
            product = new Apple();
        }

        return product;
    }
}
