package pl.jedrik94.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteProgrammingLanguage;
}
