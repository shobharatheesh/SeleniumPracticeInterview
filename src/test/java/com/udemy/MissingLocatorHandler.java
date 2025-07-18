package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MissingLocatorHandler {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test
    public void testMissingLocator() {

        //intentional incorrect Locator, 'user' doesn't exist, should be 'username'
       try {
           WebElement usernameField = driver.findElement(By.id("user"));
           usernameField.sendKeys("student");
       }
       catch(NoSuchElementException e)
       {
           System.out.println("Element not found ,Locator might be missing");
       }
       catch(Exception e)
       {
           System.out.println("Unexpected error: "+e.getMessage());
       }

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();

    }
}
