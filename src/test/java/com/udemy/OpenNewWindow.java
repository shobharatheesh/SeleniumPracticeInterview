package com.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class OpenNewWindow {
    public static void main(String[] args) {

        //Example : Using newWindow() and windowHandles()

        //set up Webdriver

        WebDriver driver = new ChromeDriver();

        // open first tab

        driver.get("https://google.com");


        //get the current window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window : " + driver.getTitle());


        //open a new window using newWindow()

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.in/");

        //get all window handles

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Child Window : " + driver.getTitle());


        //Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to parent window: " + driver.getTitle());

        // 1️⃣ Close only current tab
        //driver.close(); //  closes the focused tab

        // 2️⃣ Quit entire browser session
        driver.quit();  // closes all the tab and ends the session


    }
}
