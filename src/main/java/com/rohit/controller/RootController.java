package com.rohit.controller;
import com.rohit.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RootController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Thymeleaf");
        model.addAttribute("userName", "Rohit");

        model.addAttribute("scientists", List.of("Albert Einstein",
                "Niels Bohr",
                "James Clerk Maxwell"));

        return "index"; // returning index.html
    }
}
