package com.udemy.MutipleBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandleMutipleBrowsers {

        WebDriver driver;

        @Parameters("browser")
        @BeforeMethod
        public void setUp(String browserName)
        {
         if(browserName.equalsIgnoreCase("chrome"))
         {
          driver = new ChromeDriver();
         }
         else if(browserName.equalsIgnoreCase("firefox"));
            {
                driver = new FirefoxDriver();
        }
        driver.get("https://google.com");
    }

        @Test(groups = "sanity")
        public void test1()
        {
            System.out.println("Test1");
        }
        @Test(groups = "sanity")
        public void test2()
        {
            System.out.println("Test2");
        }

        @Test
        public void test3()
        {
            System.out.println("Test3");
        }
        @Test(groups ="sanity")
        public void test4()
        {
            System.out.println("Test4");
        }
        @Test(groups ="regression")
        public void test5()
        {
            System.out.println("Test5");
        }
        @Test(groups ="sanity")
        public void test6()
        {
            System.out.println("Test6");
        }



    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
