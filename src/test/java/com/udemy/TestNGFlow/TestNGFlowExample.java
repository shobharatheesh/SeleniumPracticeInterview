package com.udemy.TestNGFlow;

import org.testng.annotations.*;

public class TestNGFlowExample {

        @BeforeSuite
        public void beforeSuite()
        {
            System.out.println("1 -@BeforeSuite");
        }
        @BeforeTest
        public void beforeTest()
        {
            System.out.println("2 -@BeforeTest");
        }
        @BeforeClass
        public void beforeClass()
        {
            System.out.println("3 -@BeforeClass");
        }
        @BeforeMethod
        public void beforeMethod()
        {
            System.out.println("4 -@BeforeMethod");
        }
        @Test
        public void test1()
        {
            System.out.println("5 -@Test -@test1");
        }
        @Test
        public void test2()
        {
            System.out.println("6 -@Test -@test2");
        }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("7 -@AfterMethod");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("8 -@AfterClass");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("9 -@AfterTest");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("10 -@AfterSuite");
    }


}
