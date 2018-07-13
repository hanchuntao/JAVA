package com.yiibai;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGLearn {

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @Test
    public void TestNGLearn1() {
        System.out.println("this is TestNG test case1");
    }
    @Test
    public void TestNGLearn2() {
        System.out.println("this is TestNG test case2");
    }

    @Test
    public void TestNGLearn3() {
        System.out.println("this is TestNG test case3");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}