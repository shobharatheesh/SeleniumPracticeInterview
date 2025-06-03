package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlesDemoQA {

    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        String parentWindow = driver.getWindowHandle();  //current window handle
        System.out.println("Parent Window: " +driver.getTitle());

        WebElement newWindow = driver.findElement(By.id("windowButton"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        newWindow.click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Child Window: "+driver.getTitle());


        //switch back to parent window

        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent window: "+parentWindow);
        System.out.println("Parent Window: " +driver.getTitle());

        driver.quit();

    }

}
