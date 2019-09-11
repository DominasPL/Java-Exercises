package Test.ComparatorComparable.Test;

public class Employee implements Comparable<Employee>{

    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Employee o) {

        int result = this.getName().compareToIgnoreCase(o.getName());

        if (result == 0) {
            result = this.getSurname().compareToIgnoreCase(o.getSurname());

            if (result == 0) {
                result = Integer.compare(this.getAge(), o.getAge());
            }
        }

        return result;
    }
}
