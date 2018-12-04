package pl.jedrik94.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.LinkedHashMap;

@Data
public class Student implements Serializable {
    private final LinkedHashMap<String, String> countryOptions;

    private String firstName;
    private String lastName;
    private String country;

    public Student() {
        countryOptions = new LinkedHashMap<String, String>();

        countryOptions.put("DE", "Germany");
        countryOptions.put("PL", "Poland");
        countryOptions.put("UK", "United Kingdom");
    }
}
