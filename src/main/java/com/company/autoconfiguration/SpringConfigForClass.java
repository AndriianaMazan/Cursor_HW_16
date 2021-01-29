package com.company.autoconfiguration;

import com.company.ConfigurationEnabler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ConfigurationEnabler.class)
public class SpringConfigForClass {
    public SpringConfigForClass(){
        System.out.println("Spring configuration for task#1 was enabled.");
    }
}
