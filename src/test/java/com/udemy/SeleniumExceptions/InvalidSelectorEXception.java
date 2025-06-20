package com.udemy.SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorEXception {

    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //WebElement searchBox = driver.findElement(by.name("q")); //by instead of By shows InvalidSelectorEXception
        WebElement searchBox = driver.findElement(By.name("q"));

        //Overloaded sendkeys Methods

        searchBox.sendKeys("Selenium"); //Method 1: Single String
        searchBox.sendKeys(Keys.ENTER); // Method2 : Single special key
        searchBox.sendKeys("Selenium Testing",Keys.TAB); //Method3: combination

        driver.quit();





    }
}
