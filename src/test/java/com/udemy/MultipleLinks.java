package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleLinks {

    //Multiple links  we can locate using <a> tag which are basically hyperlinks.

    public static void main(String[] args)
    {
        //intialize browser
        WebDriver driver = new ChromeDriver();

        //open website
        driver.get("https://www.google.com");

        //get all <a> tag elements(Links)

        List<WebElement> links = driver.findElements(By.tagName("a"));

        //print total number of links

        System.out.println("Total Links: " +links.size());

        for(WebElement link : links)
        {
            System.out.println("Link text: "+link.getText());
            System.out.println("URL: "+ link.getAttribute("href"));
            System.out.println("===================");

        }

        driver.quit();


    }
}
