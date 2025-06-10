package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingElementClickInterceptedException {

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
            try{
            WebElement smallModal = driver.findElement(By.id("showSmallModal"));
            smallModal.click();


            WebElement largeModal = driver.findElement(By.id("showLargeModal"));
            largeModal.click();
            }

        //try clicking another element when modal is open.
           catch (ElementClickInterceptedException e)
        {

            System.out.println("Blocked by Modal.Closing Modal Button");

            //close the Modal
            WebElement closeModal = driver.findElement(By.id("closeSmallModal"));
            closeModal.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Modal-Content")));


            WebElement largeModal = driver.findElement(By.id("showLargeModal"));
            largeModal.click();

        }
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }


}

