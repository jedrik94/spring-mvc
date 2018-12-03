package pl.jedrik94.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping(value = "/processForm", method = RequestMethod.GET)
    public String processForm() {
        return "hello";
    }
}
