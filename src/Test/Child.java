package Test;

public class Child extends Parent {

    @Override
    public void eat(double weight) {
        super.eat(1/2 * weight);
    }

}
