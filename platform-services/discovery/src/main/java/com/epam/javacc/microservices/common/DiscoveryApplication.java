package com.epam.javacc.microservices.common;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DiscoveryApplication.class)
                .properties("server.port=8761", "spring.application.name=api-gateway",
                        "eureka.client.service-url.defaultZone=http://localhost:8761/eureka")
                .run(args);
    }
}
