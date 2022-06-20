package com.epam.javacc.microservices.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TwoApplication.class, args);
    }
}