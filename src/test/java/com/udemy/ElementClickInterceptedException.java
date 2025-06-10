package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElementClickInterceptedException extends Throwable {

    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/modal-dialogs");
    }

    @Test
    public void testClickInterceptedHandling()
    {
        WebElement smallModal = driver.findElement(By.id("showSmallModal"));
        smallModal.click();

        //try clicking another element when modal is open.

        WebElement largeModal = driver.findElement(By.id("showLargeModal"));
        largeModal.click();


    }


}
