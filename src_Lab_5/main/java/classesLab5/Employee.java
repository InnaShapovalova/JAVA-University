package classesLab5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;
    private Position post;
    private LocalDate birthday;

    private void Employee (String lastName, String firstName, Position post, LocalDate birthday){
        this.lastName = lastName;
        this.firstName = firstName;
        this.post = post;
        this.birthday = birthday;
    }
    public static class  Builder extends Employee {
        private String lastName;
        private String firstName;
        private Position post;
        private LocalDate birthday;

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setPosition(Position pos)
        {
            this.post = pos;
            return this;
        }
        public Builder setBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }


    }

    public String GetLastName(){
        return lastName;
    }
    public String GetFirstName(){
        return firstName;
    }
    public Position GetPost(){
        return post;
    }
    public LocalDate GetBirthday(){
        return birthday;
    }
    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Employee em = (Employee) ob;
        return Objects.equals(lastName, em.lastName) &&
                Objects.equals(firstName, em.lastName) &&
                Objects.equals(post, em.post) &&
                Objects.equals(birthday, em.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, post, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastname='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", post ='" + post.toString() + '\'' +
                ", dateOfBirth=" + birthday.toString() +
                '}';
    }
}

