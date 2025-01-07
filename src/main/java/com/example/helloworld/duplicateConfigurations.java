package com.example.helloworld;

import com.example.helloworld.data.Foo;
import org.springframework.context.annotation.Bean;

public class duplicateConfigurations {


    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
