package com.udemy.SeleniumOverloadingMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigateExample {

    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();

        //Method 1. Passing a string

        driver.navigate().to("https://www.google.com");

        //Method 2. Passing a URL object

        try {
            URL url = new URL("https://www.bing.com");
            driver.navigate().to(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
