import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class EmployeeService {
    private Employee empl;

    public long getAge(){
        long age = LocalDate.now().getYear()-empl.getBirthday().getYear();
        return age;
    }
    public String fullName(){
        return empl.getLastName() + ", " + empl.getFirstName();
    }
    public String fullNameStream(){
        return Employee::empl -> String.format("%s %s", empl.getFirstName(), empl.getLastName());
    }
}
