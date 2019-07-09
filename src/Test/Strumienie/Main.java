package Test.Strumienie;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Flat> flats = Arrays.asList(

           new Flat("Wrocław", "Krzyki", "Bielany", 12, 54.4f,true,24000),
           new Flat("Wrocław", "Centrum", "Stare miasto", 14, 88.4f,true,53000),
           new Flat("Warszawa", "Praga póludnie", "Wiejska", 5, 40.2f,false,42000),
           new Flat("Poznań", "Bemowo","Uzarczyka", 7, 100.4f,true,100000)

        );

//        flats.stream()
//                .filter(f -> f.getTown().equals("Wrocław"))
//                .filter(f -> f.getRooms() > 10)
//                .filter(f -> f.getPrice() < 30000)
//                .map(f -> )


    }

}
