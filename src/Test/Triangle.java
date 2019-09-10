package Test;

public class Triangle extends Figure implements CountField {

    @Override
    public void draw() {
        System.out.println("Draw triangle!");
    }

    @Override
    public void countField() {
        System.out.println("Hello");
    }
}
