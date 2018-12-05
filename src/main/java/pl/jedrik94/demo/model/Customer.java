package pl.jedrik94.demo.model;

import lombok.Data;
import pl.jedrik94.demo.validation.RunescapeNameCode;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class Customer implements Serializable {

    @NotBlank(message = "This field can't be empty. Please fill it.")
    @Size(min = 2, max = 45, message = "Size of this field should be between 2 and 45.")
    private String firstName;

    @NotBlank(message = "This field can't be empty. Please fill it.")
    @Size(min = 2, max = 45, message = "Size of this field should be between 2 and 45.")
    private String lastName;

    @NotNull(message = "This field can't be empty. Please fill it.")
    @Min(value = 0, message = "Value in this field should be positive or 0.")
    @Max(value = 25, message = "You can't have more than 25. Or you can?!")
    private Integer numberOfChildren;

    @Pattern(regexp = "\\d{2}-\\d{3}", message = "Incorrect postal code. Example: 12-345")
    private String postalCode;

    @RunescapeNameCode
    private String oldSchoolRunescapeName;
}
