package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleClickTestng {

    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    }

    @Test
     public void DoubleClick() {

        WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions actions = new Actions(driver);

        actions.doubleClick(button).perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //handle alert

        driver.switchTo().alert().accept();

    }

    @AfterClass
    public void tearDown()
    {
        //driver.quit();
    }

    }

