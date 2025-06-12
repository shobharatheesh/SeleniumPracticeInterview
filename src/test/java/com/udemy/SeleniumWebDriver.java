package com.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.getTitle();

        System.out.println("Title: "+driver.getTitle());

        driver.quit();
    }
}
