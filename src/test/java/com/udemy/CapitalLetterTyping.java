package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalLetterTyping {

    // This example uses Shift + a to type a capital A into an input box.

    public static void main(String[] args)
    {

       WebDriver driver = new ChromeDriver();

       driver.get("https://www.google.com");

       //locate the google search input

        WebElement inputBox = driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);

        actions.click(inputBox).keyDown(Keys.SHIFT).sendKeys("automation").keyUp(Keys.SHIFT).keyDown(Keys.ENTER).perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
