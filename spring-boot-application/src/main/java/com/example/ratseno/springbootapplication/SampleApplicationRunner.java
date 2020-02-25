package com.example.ratseno.springbootapplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("======Application Runner======");
        System.out.println("foo :"+args.containsOption("foo"));
        System.out.println("bar :"+args.containsOption("bar"));
        System.out.println("======Application Runner======");
    }
}
