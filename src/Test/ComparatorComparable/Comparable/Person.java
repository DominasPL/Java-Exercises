package Test.ComparatorComparable.Comparable;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                " ,name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person o) {

        int surnameCompare = this.surname.compareToIgnoreCase(o.getSurname());
        if (surnameCompare != 0)
            return surnameCompare;

        return this.name.compareToIgnoreCase(o.getName());
    }
}
