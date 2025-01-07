package com.example.helloworld;

import com.example.helloworld.data.Foo;
import com.example.helloworld.data.Wii;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NameBeanConfiguration {

    @Primary
    @Bean(name = "fooFirst")
    public Foo foo(){
        return new Foo();
    }


    @Bean(name = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
