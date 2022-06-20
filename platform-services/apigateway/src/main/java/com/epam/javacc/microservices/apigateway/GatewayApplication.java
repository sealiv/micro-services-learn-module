package com.epam.javacc.microservices.apigateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayApplication.class)
                    .properties("server.port=8080", "spring.application.name=discovery",
                                        "eureka.client.service-url.defaultZone=http://localhost:8761/eureka")
                    .run(args);
    }
}
