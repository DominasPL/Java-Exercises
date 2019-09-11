package Test.ComparatorComparable.Test2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        int result = o1.getName().compareToIgnoreCase(o2.getName());

        if(result == 0) {
            result = o1.getSurname().compareToIgnoreCase(o2.getSurname());

            if (result == 0) {
                result = Integer.compare(o1.getAge(), o2.getAge());
            }

        }

        return result;
    }
}
