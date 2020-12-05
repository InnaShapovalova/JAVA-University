package builder;

import validator.Employee;
import validator.Position;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class EmployeeBuilder implements Builder {

    @Size(min=1, max = 10, message = "Size.name")
    private String lastName;
    @NotNull
    private String firstName;
    private Position post;
    private LocalDate birthday;

    public Employee getResult(){
        return new Employee(lastName,firstName,post,birthday);
    }

    @Override
    public EmployeeBuilder setLastname(String lastname) {
        this.lastName = lastname;
        return this;
    }

    @Override
    public EmployeeBuilder setFirstname(String firstname) {
        this.firstName = firstname;
        return this;
    }

    @Override
    public EmployeeBuilder setPost(Position post) {
        this.post = post;
        return this;
    }


    @Override
    public EmployeeBuilder setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }
}
