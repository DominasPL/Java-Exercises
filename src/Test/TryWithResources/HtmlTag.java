package Test.TryWithResources;


public class HtmlTag implements AutoCloseable {

    private String name;

    public HtmlTag(String name) {
        this.name = name;
        System.out.println("Utworzenie znacznika: " + name);
    }

    public String body(String text) {
        return text;
    }


    @Override
    public void close() {
        System.out.println("Zamykanie znacznika: " + name);
    }
}
