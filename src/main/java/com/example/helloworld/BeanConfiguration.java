package com.example.helloworld;

import com.example.helloworld.data.Foo;
import com.example.helloworld.data.Wii;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Foo Created");
        return foo;
    }


    @Bean
    public Wii wii(){
        Wii wii = new Wii();
        log.info("Wiiiiii");
        return wii;
    }
}
