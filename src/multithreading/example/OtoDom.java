package multithreading.example;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OtoDom {

    //47,947s - without multithreading
    //1,353s - with multithreading 34 threads
    //1,180s - with multithreading 15 threads
    //1,192s - with multithreading 10 threads
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

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

        for (int i = 0; i < links.size() ; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    loadPageContentAndWriteToFile((String)links.toArray()[finalI], finalI + ".html");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        }

        executorService.shutdown();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

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
