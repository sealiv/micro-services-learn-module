package com.epam.javacc.microservices.common;

import com.netflix.config.*;
import com.netflix.config.sources.URLConfigurationSource;
import org.apache.commons.configuration.AbstractConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

/**
 * Properties can read from config.properties, application.properties
 * and from any file which use in @Bean: public AbstractConfiguration addApplicationPropertiesSource() {...}
 */
@RestController
public class ConfigPropertiesController {

    private DynamicStringProperty propertyFromAbstractConfigurationBean = DynamicPropertyFactory.getInstance()
            .getStringProperty("baeldung.archaius.properties.one", "not found!");
    private DynamicStringProperty propertyFromConfig_properties = DynamicPropertyFactory.getInstance()
            .getStringProperty("a1", "not found!");
    private DynamicStringProperty propertyFromApplication_properties = DynamicPropertyFactory.getInstance()
            .getStringProperty("a2", "not found!");

    @GetMapping("/property-from-dynamic-management")
    public String getPropertyValue() {
        return propertyFromAbstractConfigurationBean.getName() + ": " + propertyFromAbstractConfigurationBean.get();
    }

    @GetMapping("/a1")
    public String getPropertyValueA1() {
        DynamicStringProperty propertyFromConfig_properties = DynamicPropertyFactory.getInstance()
                .getStringProperty("a1", "not found!");
        return propertyFromConfig_properties.getName() + ": " + propertyFromConfig_properties.get();
    }

    @GetMapping("/a2")
    public String getPropertyValueA2() {
        return propertyFromApplication_properties.getName() + ": " + propertyFromApplication_properties.get();
    }

    @Bean
    public AbstractConfiguration addApplicationPropertiesSource() throws IOException {
        URL configPropertyURL = (new ClassPathResource("other-config.properties")).getURL();
        PolledConfigurationSource source = new URLConfigurationSource(configPropertyURL);
        return new DynamicConfiguration(source, new FixedDelayPollingScheduler());
    }
}
