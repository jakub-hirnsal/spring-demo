package com.sda.demo.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SimpleCalculator {

    private ObjectMapper objectMapper;
    private ClassA classA;

    @Autowired
    public SimpleCalculator(ObjectMapper objectMapper, ClassA classA) {
        System.out.println("Creating SimpleCalculator...");
        this.objectMapper = objectMapper;
        this.classA = classA;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

}
