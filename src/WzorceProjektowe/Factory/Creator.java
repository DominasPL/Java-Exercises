package WzorceProjektowe.Factory;

public abstract class Creator {

    public void doAction(String type) {
        Product product = createProduct(type);
        System.out.println(product.getName());
    }

    abstract Product createProduct(String type);

}
