package Test.ComparatorComparable.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Dominas", "Stepuch", 21),
                new Employee("Andrzej", "Polak", 21),
                new Employee("Eryk", "Magneto", 45),
                new Employee("Ezekiel", "King", 41),
                new Employee("Negan", "Walker", 23)
        ));

        //Age -> Name -> Surname
//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//
//                //First age
//                int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
//                if (ageCompare != 0)
//                    return ageCompare;
//
//                //Second name
//                int nameCompare = o1.getName().compareToIgnoreCase(o2.getName());
//                if (nameCompare != 0)
//                    return nameCompare;
//
//                return o1.getSurname().compareToIgnoreCase(o2.getSurname());
//
//            }
//        });

        //Surname -> Age -> Name
//        employees.sort((o1, o2) -> {
//
//            int surnameCompare = o1.getSurname().compareToIgnoreCase(o2.getSurname());
//            if (surnameCompare != 0)
//                return surnameCompare;
//
//            int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
//            if (ageCompare != 0)
//                return ageCompare;
//
//            return o1.getName().compareToIgnoreCase(o2.getName());
//
//        });

//
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }


        employees.stream()
                .sorted((o1, o2) -> {

                    int surnameCompare = o1.getSurname().compareToIgnoreCase(o2.getSurname());
                    if (surnameCompare != 0)
                        return surnameCompare;

                    int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
                    if (ageCompare != 0)
                        return ageCompare;

                    return o1.getName().compareToIgnoreCase(o2.getName());

                })
                .forEach(System.out::println);

    }
}
