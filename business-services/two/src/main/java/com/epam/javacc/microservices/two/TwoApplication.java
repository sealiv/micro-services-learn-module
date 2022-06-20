package com.epam.javacc.microservices.two;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TwoApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TwoApplication.class)
                .properties("server.port=0", "spring.application.name=two",
                        "eureka.client.service-url.defaultZone=http://localhost:8761/eureka")
                .run(args);
    }
}