package com.example.helloworld;

import com.example.helloworld.data.Foo;
import com.example.helloworld.data.FooWii;
import com.example.helloworld.data.Wii;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Wii wii(){
        return new Wii();
    }

    @Bean
    public FooWii fooWii(Foo foo, Wii wii){
        return new FooWii(foo, wii);
    }
}
