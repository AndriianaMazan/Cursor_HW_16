package com.company.autoconfiguration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    public SpringConfig(){
            System.out.println("Spring configuration was enabled.");
    }
}
