package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {

        List<String> superHeroes = Arrays.asList("Hulk", "Thor", "IronMan", "BlackWidow", "CptAmerica", "Groot", "SpiderMan", "Batman", "GreenHornet");

        List<String> newSuperHeroList = superHeroes.stream()
                .filter(s -> s.startsWith("G"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newSuperHeroList);
    }

}
