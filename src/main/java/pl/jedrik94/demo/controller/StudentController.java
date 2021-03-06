package pl.jedrik94.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.jedrik94.demo.model.Student;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @Value("#{programmingLanguages}")
    private Map<String, String> programmingLanguages;

    @Value("#{pets}")
    private Map<String, String> pets;

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(Model model) {

        Student student = new Student();

        model.addAttribute("student", student);
        model.addAttribute("countryOptions", countryOptions);
        model.addAttribute("programmingLanguages", programmingLanguages);
        model.addAttribute("pets", pets);

        return "student-form";
    }

    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute("student") Student student) {

        return "student-confirmation";
    }
}
