package com.epam.javacc.microservices.twoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TwoApiController {

    @GetMapping
    public String getPropertyValue() {
        return "Main response from 'Two-API' microservice!";
    }
}
