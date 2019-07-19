package Test.Comparator;

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

        if (this.getSurname().compareToIgnoreCase(o.getSurname()) == 0)
            return o.getName().compareToIgnoreCase(this.getName());

        return this.getSurname().compareToIgnoreCase(o.getSurname());

    }
}
