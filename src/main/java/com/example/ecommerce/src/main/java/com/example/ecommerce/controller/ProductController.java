package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/")
    public String home(Model model) {
        List<String> products = Arrays.asList("Laptop", "Smartphone", "Headphones", "Smartwatch");
        model.addAttribute("products", products);
        return "index";
    }
}
