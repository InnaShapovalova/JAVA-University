package validator;
import builder.*;
import builder.EmployeeBuilder;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.xml.validation.Validator;
import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        EmployeeBuilder em1 = new EmployeeBuilder().setLastname("Shapovalova").setFirstname("Inna").setBirthday(LocalDate.parse("24/02/2001"));
        EmployeeBuilder em2 = new EmployeeBuilder().setLastname("Ira").setFirstname("Zag").setBirthday(LocalDate.parse("24/07/1998"));

        Validator validator = (Validator) Validation.buildDefaultValidatorFactory().getValidator();
        Employee em = new Employee("Zag", "Emma", Position.DRESSER, LocalDate.parse("25/08/2000"));
        Set<ConstraintViolation<Employee>> constraintViolations = validator.validate(em);

        for(ConstraintViolation constraintViolation : constraintViolations) {
            String fieldName = constraintViolation.getPropertyPath().toString().toUpperCase();
            System.out.println(fieldName + " " + constraintViolation.getMessage());
        }

    }
}
