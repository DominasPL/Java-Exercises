package Test.ComparatorComparable.Test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Dominik", "Stepuch", 10),
                new Employee("Abndrzej", "Kołotko", 12),
                new Employee("Stefan", "Arbuzowski", 89),
                new Employee("Halyna", "Kowalska", 34),
                new Employee("Janusz", "Nosacz", 14),
                new Employee("Dominik", "Stepuch", 8)
        );

//        employees.sort(new EmployeeComparator());
//        System.out.println(employees);

//        employees.sort((e1, e2) -> {
//
//            int result = e1.getName().compareToIgnoreCase(e2.getName());
//
//            if(result == 0) {
//                result = e1.getSurname().compareToIgnoreCase(e2.getSurname());
//
//                if (result == 0) {
//                    result = Integer.compare(e1.getAge(), e2.getAge());
//                }
//
//            }
//            return result;
//
//        });


        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
