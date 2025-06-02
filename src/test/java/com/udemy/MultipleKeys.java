package com.udemy;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {

    public static void main(String[] args)
    {

       WebDriver driver = new ChromeDriver();

       driver.get("https://google.com");


       Actions actions = new Actions(driver);

       actions.keyDown(Keys.CONTROL)
            .keyDown(Keys.SHIFT)
            .sendKeys("s") // lowercase 's'
            .keyUp(Keys.SHIFT)
            .keyUp(Keys.CONTROL)
            .perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();



    }
}
