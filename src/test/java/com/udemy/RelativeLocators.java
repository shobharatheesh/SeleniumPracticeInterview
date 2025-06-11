package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RelativeLocators {

    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");

    }
    @Test
    public void TestRelativeLocator() {
        //Locate book 1

        WebElement book1 = driver.findElement(By.id("pid1"));

        // Find the book to the right of Book 1

        WebElement bookRightOf1 = driver.findElement(RelativeLocator.with(By.tagName("li")).toRightOf(book1));

        System.out.println("Book to the right of Book1 has id: " + bookRightOf1.getAttribute("id"));
    }

        @AfterClass
        public void tearDown()
        {
            driver.quit();
        }

    }



