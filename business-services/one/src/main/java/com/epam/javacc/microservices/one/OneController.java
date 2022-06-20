package com.epam.javacc.microservices.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OneController {

    @GetMapping
    public String getPropertyValue() {
        return "Main response from 'One' microservice!";
    }
}
