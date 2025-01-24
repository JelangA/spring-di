package com.example.helloworld;


import com.example.helloworld.data.DependsOnConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    @BeforeEach
    void setup() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }


    @Test
    void testDependsOn() {

    }

}
