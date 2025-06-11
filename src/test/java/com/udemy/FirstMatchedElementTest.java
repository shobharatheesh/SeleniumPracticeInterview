package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstMatchedElementTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
    }

    @Test

    public void testEnterFullName() {
        //find the first matched input field by tagname

        WebElement inputfield = driver.findElement(By.tagName("input"));

        inputfield.sendKeys("John Doe");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit wait

        WebElement submitButton = driver.findElement(By.id("submit"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

        submitButton.click();

        //verify output

        WebElement output = driver.findElement(By.id("output"));

        System.out.println("OutShown :" + output.getText());
        System.out.println("Form Submitted: " + output.isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
