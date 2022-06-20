package com.epam.javacc.microservices.twoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TwoApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TwoApiApplication.class, args);
    }
}