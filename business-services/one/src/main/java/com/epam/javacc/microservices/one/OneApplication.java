package com.epam.javacc.microservices.one;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OneApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(OneApplication.class)
                .properties("server.port=0", "spring.application.name=one",
                        "eureka.client.service-url.defaultZone=http://localhost:8761/eureka")
                .run(args);
    }
}