package com.rohit.controller;
import com.rohit.model.Employee;
import com.rohit.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RootController {

    @GetMapping("/")
    public String index(Model model) {
//        model.addAttribute("pageTitle", "Thymeleaf");
//        model.addAttribute("userName", "Mohit");
//        model.addAttribute("userId", 555);
        model.addAttribute("scientists", List.of("Albert Einstein",
                "Niels Bohr",
                "James Clerk Maxwell"));

        Person person=new Person();
        person.setName("Rohit");
        person.setAge(25);

        model.addAttribute("person1",person);

        return "index"; // returning index.html
    }
}
