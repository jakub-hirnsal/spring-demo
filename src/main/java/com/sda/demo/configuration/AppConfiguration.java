package com.sda.demo.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {

    @Bean()
    public ObjectMapper objectMapper() {
        System.out.println("Creating ObjectMapper..");
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper;
    }
}
