package com.mavenspring.springboot; // Update this to match your actual package structure

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {


    // localhost:8083/
    @GetMapping("/")
    public String greeting() {
        return "index";
        
    }
    
}

