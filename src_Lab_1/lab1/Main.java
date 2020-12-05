package lab1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee.Builder().setLastName("Inna").setFirstName("Shap").setPosition(Position.SINGER).setBirthday(LocalDate.of(2001,2,24));
        Employee em2 = new Employee.Builder().setLastName("Ira").setFirstName("Zag").setPosition(Position.SINGER).setBirthday(LocalDate.of(1997,4,5));



    }
}

