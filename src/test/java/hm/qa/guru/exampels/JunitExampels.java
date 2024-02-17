package hm.qa.guru.exampels;

import org.junit.jupiter.api.*;

public class JunitExampels {

    @BeforeAll
    static void setUtp(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void setOff(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("    BeforeEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("    AfterEach");
    }


    @Test
    void test(){
    }

}
