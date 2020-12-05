package validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Year;

public abstract class EmployeeCodeExistingValidator implements ConstraintValidator<EmployeeCodeExisting,LocalDate>{
    @Override
    public boolean isValid(LocalDate birth, ConstraintValidatorContext context) {
        return (Year.now().getValue() - birth.getYear()) >= 18;
    }


}
