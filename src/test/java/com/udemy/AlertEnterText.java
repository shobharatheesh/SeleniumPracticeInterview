package com.udemy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertEnterText {

    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }

    @Test
    public void AlertTest() {
        WebElement jsButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsButton.click();

        //switch to alert

        Alert alert = driver.switchTo().alert();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Enter the text in the prompt

        String inputText = "Selenium Test";
        alert.sendKeys(inputText);

        alert.accept();

        WebElement result = driver.findElement(By.id("result"));

        System.out.println("Displayed result : "+result.getText());

        Assert.assertEquals("Selenium Test","Selenium Test");

    }

        @AfterClass
        public void tearDown()
        {
            driver.quit();
        }


    }

