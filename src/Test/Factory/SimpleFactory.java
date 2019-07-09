package Test.Factory;

public class SimpleFactory implements Creator {


    @Override
    public Product createProduct(String type) {
        Product product = null;

        if(type.equals("triangle")){
            product = new TriangleProduct();
        }  else if(type.equals("square")){
            product = new SquareProduct();
        }
        return product;

    }



}
