package com.demoqa.tests;

import org.junit.jupiter.api.*;

public class JUnitDemoTest {


    @BeforeAll
    static void setUp(){
        System.out.println("### @BeforeAll      !");
    }
    @AfterAll
    static void setUp2(){
        System.out.println("### @AfterAll       !");
    }

    @BeforeEach
    void setUp1(){
        System.out.println("### @BeforeEach !");
    }

    @AfterEach
    void setUp4(){
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
