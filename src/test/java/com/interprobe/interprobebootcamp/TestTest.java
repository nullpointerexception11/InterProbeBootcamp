package com.interprobe.interprobebootcamp;

import org.junit.jupiter.api.*;

/**
 * @author theLostCode
 * @Date 7/6/2022
 */
public class TestTest {

//    @BeforeAll --> hepsinden once - static olmali
//    @BeforeEach --> bir seyden once
//    @AfterEach --> bir seyden sonra
//    @AfterAll --> hepsinden sonra - static olmali

    @BeforeAll
    public static void setup() {
        System.out.println("@BeforeAll");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }


}
