package pl.jedrik94.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RunescapeCodeConstraintValidator implements ConstraintValidator<RunescapeNameCode, String> {

    private String nameSufix;

    @Override
    public void initialize(RunescapeNameCode constraintAnnotation) {
        nameSufix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String runescapeName, ConstraintValidatorContext constraintValidatorContext) {
        return runescapeName.endsWith(nameSufix);
    }
}
