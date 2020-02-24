package com.example.ratseno.springbootgettingstrated;

import com.example.ratseno.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGettingStratedApplication {

	public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringBootGettingStratedApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }
}
