import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String lastName;
    private String firstName;
    private Position post;
    private LocalDate birthday;

    public void Employee (String lastName, String firstName, Position post, LocalDate birthday){
        this.lastName = lastName;
        this.firstName = firstName;
        this.post = post;
        this.birthday = birthday;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public Position getPost(){
        return post;
    }
    public LocalDate getBirthday(){
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

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
enum Position{
    DIRECTOR,SINGER,DRESSER,PRODUCER,MANAGER;
}