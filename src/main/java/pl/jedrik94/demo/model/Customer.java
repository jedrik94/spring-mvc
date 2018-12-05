package pl.jedrik94.demo.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class Customer implements Serializable {

    @NotBlank(message = "This field can't be empty. Please fill it.")
    @Size(min = 2, max = 45, message = "Size of this field should be between 2 and 45.")
    private String firstName;

    @NotBlank(message = "This field can't be empty. Please fill it.")
    @Size(min = 2, max = 45, message = "Size of this field should be between 2 and 45.")
    private String lastName;
}
