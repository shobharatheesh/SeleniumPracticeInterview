package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitsRealExample {

    public static void main(String[] args)
    {

       WebDriver driver = new ChromeDriver();

       //implicit wait - applied globally

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Enter username and password

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        //click login

        driver.findElement(By.cssSelector("button[type='submit")).click();

        //Explicit wait until dashboard text is visible

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));

        System.out.println("Page heading is: "+dashboard.getText());

        //Fluent wait -wait until ' My info ' tab is clickable

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);

        WebElement myInfoTab = driver.findElement(By.xpath("//span[text()='My Info']"));

        myInfoTab.click();
        System.out.println("Clicked on My Info tab succesfully");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();










    }
}
