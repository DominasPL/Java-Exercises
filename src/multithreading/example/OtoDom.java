package multithreading.example;

import java.io.*;
import java.net.URL;
import java.util.*;

public class OtoDom {

    public static void main(String[] args) throws IOException {

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

        Set<String> links = findAllLinks(stringBuilder.toString());
        int fileName = 1;
        for (String link : links) {
            loadPageContentAndWriteToFile(link, fileName + ".html");
            fileName++;
        }


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

        System.out.println(links.size());

        return links;
    }

    public static void loadPageContentAndWriteToFile(String link, String fileName) throws IOException {

        URL otodom = new URL(link);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(otodom.openStream()));

        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
            stringBuilder.append(System.lineSeparator());
        }

        in.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, false));
        bw.write(stringBuilder.toString());
        bw.close();
    }




}
