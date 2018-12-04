package pl.jedrik94.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.jedrik94.demo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(Model model) {

        Student student = new Student();

        model.addAttribute("student", student);

        return "student-form";
    }

    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute("student") Student student) {

        return "student-confirmation";
    }
}
