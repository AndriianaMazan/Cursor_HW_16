package com.company.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigForBean {

    public SpringConfigForBean() {
        System.out.println("Spring configuration for task#2 was enabled.");
    }

    @Bean
    @ConditionalOnProperty(
            name = "custom.configuration.enabled",
            havingValue = "true"
    )
    public void springConfigForBean(){
        System.out.println("Property bean");
    }

}
