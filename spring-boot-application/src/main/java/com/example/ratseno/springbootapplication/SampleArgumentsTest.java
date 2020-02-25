package com.example.ratseno.springbootapplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleArgumentsTest {

    public SampleArgumentsTest(ApplicationArguments applicationArguments) {
        System.out.println("foo :"+applicationArguments.containsOption("foo"));
        System.out.println("bar :"+applicationArguments.containsOption("bar"));
    }
}
