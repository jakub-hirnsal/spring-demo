package com.sda.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

    private ClassB classB;

    @Autowired
    public ClassA(ClassB classB) {
        System.out.println("Creating ClassA.. ");
        this.classB = classB;
    }
}
