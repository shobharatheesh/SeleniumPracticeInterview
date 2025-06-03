package com.udemy;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotExample {

    public static void main(String[] args)
    {

     //set up chromedriver

     WebDriver driver  = new ChromeDriver();

     driver.manage().window().maximize();
     driver.get("https://www.google.com");

     //Take screenshot

        TakesScreenshot ts = (TakesScreenshot) driver;

        //store as a file

        File src = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File("screenshot.png");

        //save to desired location

        try {
            FileUtils.copyFile(src,dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Screenshot saved successfully");

        driver.quit();


    }
}
