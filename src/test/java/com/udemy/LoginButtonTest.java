package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginButtonTest {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod
    public void setUp()
    {
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://practicetestautomation.com/practice-test-login/");
     wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void testLoginButtonClickable()
    {

        //enter username and password

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");

        //wait until login button is clickable

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

        System.out.println("Is Displayed: " +loginBtn.isDisplayed());
        System.out.println("Is Enabled: " +loginBtn.isEnabled());

        loginBtn.click();

        String url = driver.getCurrentUrl();
        System.out.println("Redirected to:  "+url);


    }


    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
