package com.gajademo.springcoredemo.config;

import com.gaja.utils.Coach;
import com.gaja.utils.SwimCooach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sportconfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCooach();
    }
}
