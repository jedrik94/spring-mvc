package pl.jedrik94.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = RunescapeCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RunescapeNameCode {

    String value() default "@OSRS";

    String message() default "Must end with @OSRS";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
