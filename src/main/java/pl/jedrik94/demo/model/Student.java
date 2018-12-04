package pl.jedrik94.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteProgrammingLanguage;
    private List<String> ownedPets;
}
