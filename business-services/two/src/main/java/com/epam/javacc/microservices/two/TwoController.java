package com.epam.javacc.microservices.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TwoController {

    @GetMapping
    public String getPropertyValue() {
        return "Main response from 'Two' microservice!";
    }
}
