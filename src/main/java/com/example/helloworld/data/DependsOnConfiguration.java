package com.example.helloworld.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @DependsOn({"wii"})
    public Foo foo(){
        log.info("Foo Created");
        return new Foo();
    }

    @Bean
    public Wii wii(){
        log.info("Wiiiiii Created");
        return new Wii();
    }

}
