package com.sda.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service(value = "hardServiceImpl")
public class HardServiceImpl implements MyService {

    public HardServiceImpl() {
        System.out.println("Creating HardServiceImpl.. ");
    }

    @Override
    public void printName() {
        System.out.println("I am HardServiceImpl.. ");
    }
}
