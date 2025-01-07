package com.example.helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    
    @Test
    void testSingleton(){

        var darabase1 = Database.getInstance();
        var darabase2 = Database.getInstance();

        Assertions.assertSame(darabase1, darabase2);
    }
}
