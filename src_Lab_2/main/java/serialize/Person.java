package serialize;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private int id;
    private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Person (String name, String lastName, int id, LocalDate birthday){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.birthday = birthday;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
