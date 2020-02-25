package com.example.ratseno.springbootexternalizedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    SampleProperties sampleProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=====run=====");
        System.out.println(sampleProperties.getName());
        System.out.println(sampleProperties.getAge());
        System.out.println("=============");
    }
}
