package com.example.ratseno.springbootexternalizedconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Value("${ratseno.fullName}")
    private String name;

    @Value("${ratseno.age}")
    private String age;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=====run=====");
        System.out.println(name);
        System.out.println(age);
        System.out.println("=============");
    }
}
