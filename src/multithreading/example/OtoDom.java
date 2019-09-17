package multithreading.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class OtoDom {

    public static void main(String[] args) throws IOException {


        String content = loadPageContent();
        Set<String> links = findAllLinks(content);

        links.stream()
            .forEach(s -> System.out.println(s));
        System.out.println(links.size());


    }

    public static Set<String> findAllLinks(String content) {

        Set<String> links = new HashSet<>();

        for (int i = 0; i < content.length(); i++) {
            i = content.indexOf("https://www.otodom.pl/oferta/", i);
            if (i < 0) {
                break;
            }

            String[] strings = content.substring(i).split(".html");
            links.add(strings[0]);
        }

        return links;
    }

    public static String loadPageContent() throws IOException {

        URL otodom = new URL("https://www.otodom.pl/sprzedaz/mieszkanie/wroclaw/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(otodom.openStream()));

        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
            stringBuilder.append(System.lineSeparator());
        }

        in.close();

        return stringBuilder.toString();
    }


}
