package Test.Factory;

public class ProductProcess {

    private SimpleFactory simpleFactory;


    public ProductProcess(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void doAction(String name) {
        Product product = simpleFactory.createProduct(name);
        System.out.println(product.getName());

    }

}
