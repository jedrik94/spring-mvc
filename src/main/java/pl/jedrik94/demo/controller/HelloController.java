package pl.jedrik94.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hey")
public class HelloController {

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping(value = "/processForm", method = RequestMethod.GET)
    public String processForm() {
        return "hello";
    }

    @RequestMapping(value = "/processFormUpper")
    public String showFormToUpperCase(@RequestParam(value = "studentName") String name, Model model) {
        String result = "U got that, " + name.toUpperCase() + "!";

        model.addAttribute("message", result);

        return "hello";
    }
}
