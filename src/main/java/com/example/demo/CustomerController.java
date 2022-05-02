package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
    
    @GetMapping("/customers")
    public String getMessage()
    {
        return "Hello hello AI from staging trial";
    }
}
