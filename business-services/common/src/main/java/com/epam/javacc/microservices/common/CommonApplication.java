package com.epam.javacc.microservices.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }
}
