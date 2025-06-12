package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FetchTextFromTextBoxTest {

    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://demoqa.com/text-box");

    }

    @Test
    public void fetchTextFromTextBox() {
        //Enter text into full name input field
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("John Doe");

        //Fetch the text using getAttribute("value")

        String enteredText = fullNameInput.getAttribute("value");
        System.out.println("Entered Name : " + enteredText);

        //Assertion
        Assert.assertEquals("John Doe","John Doe");
        System.out.println("True Or False : "  +enteredText.equals("John Doe"));

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();

    }


}
