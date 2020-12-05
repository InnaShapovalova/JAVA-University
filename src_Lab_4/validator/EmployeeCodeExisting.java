package validator;

import validator.EmployeeCodeExistingValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = EmployeeCodeExistingValidator.class)
public @interface EmployeeCodeExisting {
    String message() default "{EmployeeCodeExisting}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
