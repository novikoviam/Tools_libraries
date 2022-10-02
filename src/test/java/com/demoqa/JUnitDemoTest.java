package com.demoqa;

import org.junit.jupiter.api.*;

public class JUnitDemoTest {


    @BeforeAll
    static void setUp(){
        System.out.println("### @BeforeAll      !");
    }
    @AfterAll
    static void setUp(){
        System.out.println("### @AfterAll       !");
    }

    @BeforeEach
    void setUp(){
        System.out.println("### @BeforeEach !");
    }

    @AfterEach
    void setUp(){
        System.out.println("### @AfterEach  !");
    }


    @Test
    void simpleTestFirst() {
        System.out.println("### @Test simpleTestFirst() !");
        Assertions.assertTrue(3>2);

    }

    @Test
    void simpleTestSecond() {
        System.out.println("### @Test simpleTestSecond() !");
        Assertions.assertTrue(3>2);
    }

}
