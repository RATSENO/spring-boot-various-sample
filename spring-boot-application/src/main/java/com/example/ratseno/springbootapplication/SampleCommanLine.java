package com.example.ratseno.springbootapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SampleCommanLine implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("======CommandLineRunner=====");
        Arrays.stream(args).forEach(System.out::println);
        System.out.println("======CommandLineRunner=====");
    }
}
