package Test.TryWithResources;

public class Main {

    public static void main(String[] args) {

        try (
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em")
        ) {
            System.out.println(em.body("moj tekst"));
        }


    }


}
