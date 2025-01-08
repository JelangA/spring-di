package com.example.helloworld;

import com.example.helloworld.data.Foo;
import com.example.helloworld.data.FooWii;
import com.example.helloworld.data.Wii;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo foo2(){
        return new Foo();
    }

    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Wii wii(){
        return new Wii();
    }

    @Bean
    public FooWii fooWii(@Qualifier("foo1") Foo foo, Wii wii){
        return new FooWii(foo, wii);
    }
}
