package com.sda.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service(value = "simpleServiceImpl")
public class SimpleServiceImpl implements MyService {

    public SimpleServiceImpl() {
        System.out.println("Creating SimpleServiceImpl.. ");
    }

    @Override
    public void printName() {
        System.out.println("I am SimpleServiceImpl.. ");
    }
}
