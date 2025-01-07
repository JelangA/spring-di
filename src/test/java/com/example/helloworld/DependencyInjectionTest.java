package com.example.helloworld;

import com.example.helloworld.data.Foo;
import com.example.helloworld.data.FooWii;
import com.example.helloworld.data.Wii;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDi() {
        Foo foo = applicationContext.getBean(Foo.class);
        Wii wii = applicationContext.getBean(Wii.class);
        FooWii fooWii = applicationContext.getBean(FooWii.class);

        Assertions.assertSame(foo, fooWii.getFoo());
        Assertions.assertSame(wii, fooWii.getWii());
    }

    @Test
    void testNoDi() {

        Foo foo = new Foo();
        Wii wii = new Wii();

        FooWii fooWii = new FooWii(foo, wii);

        Assertions.assertSame(foo, fooWii.getFoo());
        Assertions.assertSame(wii, fooWii.getWii());

//        Assertions.assertSame(foo, fooWii.getWii());
    }
}
