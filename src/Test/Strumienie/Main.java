package Test.Strumienie;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        List<Flat> flats = Arrays.asList(
//
//           new Flat("Wrocław", "Krzyki", "Bielany", 12, 54.4f,true,24000),
//           new Flat("Wrocław", "Centrum", "Stare miasto", 14, 88.4f,true,53000),
//           new Flat("Warszawa", "Praga póludnie", "Wiejska", 5, 40.2f,false,42000),
//           new Flat("Poznań", "Bemowo","Uzarczyka", 7, 100.4f,true,100000)
//
//        );

//        flats.stream()
//                .filter(f -> f.getTown().equals("Wrocław"))
//                .filter(f -> f.getRooms() > 10)
//                .filter(f -> f.getPrice() < 30000)
//                .map(f -> )

//        List<String> fruits =
//                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
//                        "cherry", "apple", "pomelo");
//
//
//        List<String> editedList = fruits.stream()
//            .filter(s -> s.startsWith("p"))
//            .map(s -> s.toUpperCase())
//            .sorted((s1, s2) -> s2.length() - s1.length())
//            .collect(Collectors.toList());
////
////        editedList.forEach(s -> System.out.println(s));
////
//
//        List<BoardGame> games = Arrays.asList(
//                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
//                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
//                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
//                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
//                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
//                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
//                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
//                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
//                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
//                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
//        );
//
//
//
//        games.stream()
//                .filter(g -> g.maxPlayers > 2)
//                .filter(g -> g.rating > 8)
//                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
//                .map(g -> g.name.toUpperCase())
//                .forEach(System.out::println);
//
//
//        Integer[] tab = {1, 5, 5, 3, 10};
//
//        Stream<Integer> stream = Arrays.stream(tab);
//        stream
//            .filter(n -> n >= 5)
//            .forEach(System.out::println);
//
//
//        String str = " sadsad asF ";
//
//

        int i = 0;
        do{
            System.out.println((++i*2)+", ");
        }while(i<10);

    }

}
