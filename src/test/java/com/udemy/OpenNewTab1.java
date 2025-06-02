package com.udemy;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab1 {

    //Opening a new tab is a common keyboard shortcut (Ctrl + T) on most browsers

    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
