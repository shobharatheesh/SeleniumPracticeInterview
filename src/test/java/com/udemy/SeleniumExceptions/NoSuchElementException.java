package com.udemy.SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoSuchElementException {

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement menu = driver.findElement(By.id("menu"));

        Actions actions = new Actions(driver);

        actions.moveToElement(menu).perform(); //Method1: Move to element only

        actions.moveToElement(menu,10,20).perform(); //Method2: move to element with offset

        driver.quit();



    }
}
