package builder;

import javax.swing.text.Position;
import java.time.LocalDate;

public interface Builder {
    EmployeeBuilder setLastname(String lastname);
    EmployeeBuilder setFirstname(String firstname);


    EmployeeBuilder setPost(validator.Position post);

    EmployeeBuilder setBirthday(LocalDate birthday);
}
