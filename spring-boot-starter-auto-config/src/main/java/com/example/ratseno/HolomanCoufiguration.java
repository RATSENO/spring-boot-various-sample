package com.example.ratseno;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HolomanCoufiguration {
    @Bean
    @ConditionalOnMissingBean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setHowLong(5);
        holoman.setName("ratseno");
        return holoman;
    }
}
