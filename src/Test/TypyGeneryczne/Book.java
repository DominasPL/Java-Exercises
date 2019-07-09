package Test.TypyGeneryczne;

public class Book<T extends Number & Comparable> {

    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Long getAsLong(){
        return element.longValue();
    }

}
