package Test.Fasada;

public class Fasade {

    private Element1 element1;
    private Element2 element2;
    private Element3 element3;

    public Fasade() {
        this.element1 = new Element1();
        this.element2 = new Element2();
        this.element3 = new Element3();
    }

    public void method1() {
        this.element1.element1Text();
    }

    public void method2() {
        this.element2.element2Text();
    }

    public void method3() {
        this.element3.element3Text();
    }





}
