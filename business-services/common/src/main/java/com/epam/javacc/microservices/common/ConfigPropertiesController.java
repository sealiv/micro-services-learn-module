package com.epam.javacc.microservices.common;

import com.netflix.config.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPropertiesController {

    private final DynamicStringProperty eurekaPort;
    private final DynamicStringProperty onePort;
    private final DynamicStringProperty twoPort;
    private final DynamicStringProperty twoApiPort;
    private final DynamicStringProperty eurekaDefaultZone;

    public ConfigPropertiesController() {
        eurekaPort = DynamicPropertyFactory.getInstance().getStringProperty("eureka.port", "8066");
        onePort = DynamicPropertyFactory.getInstance().getStringProperty("one.port", "8001");
        twoPort = DynamicPropertyFactory.getInstance().getStringProperty("two.port", "8002");
        twoApiPort = DynamicPropertyFactory.getInstance().getStringProperty("two-api.port", "8003");
        eurekaDefaultZone = DynamicPropertyFactory.getInstance()
                .getStringProperty("eureka.client.service-url.defaultZone", "http://localhost:8066/eureka");
    }

    @GetMapping("/eurekaPort")
    public String getEurekaPortValue() {
        return "Eureka port is: " + eurekaPort.getValue();
    }

    @GetMapping("/onePort")
    public String getOnePortValue() {
        return "Port for module 'One' is: " + onePort.getValue();
    }

    @GetMapping("/twoPort")
    public String getTwoPortValue() {
        return "Port for module 'Two' is: " + twoPort.getValue();
    }

    @GetMapping("/twoApiPort")
    public String getTwoApiPortValue() {
        return "Port for module 'Two-api' is: " + twoApiPort.getValue();
    }

    @GetMapping("/eurekaZone")
    public String getEurekaDefaultZoneValue() {
        return "Default zone for Eureka is: " + eurekaDefaultZone.getValue();
    }
}
