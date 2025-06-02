package com.udemy;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiKeyPressExample {

    public static void main(String[] args) {

        //initialize webDriver

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //create Actions object

        Actions actions = new Actions(driver);

        //press control+shift+alt

        actions.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).keyDown(Keys.ALT).keyUp(Keys.ALT).keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();

        System.out.println("Press multiple keys at the same time , we use Action class");

        driver.quit();

    }
}


