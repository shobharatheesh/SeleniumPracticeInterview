package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlesTestng {

       WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/browser-windows");
        }


        @Test
        public void allWindowHandles() {
            String parentWindow = driver.getWindowHandle();  //current window handle
            System.out.println("Parent Window: " + driver.getTitle());

            WebElement newWindow = driver.findElement(By.id("windowButton"));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            newWindow.click();

            Set<String> allWindows = driver.getWindowHandles();
            System.out.println("Child Window: " + driver.getTitle());

            for(String handle : allWindows)
            {
                System.out.println(handle);
            }

            //switch back to parent window

            driver.switchTo().window(parentWindow);
            System.out.println("Back to Parent window: " + parentWindow);
            System.out.println("Parent Window: " + driver.getTitle());

        }

        @AfterClass
        public void tearDown()
        {
        driver.quit();

    }

}
