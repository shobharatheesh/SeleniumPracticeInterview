package com.udemy.InterfacePracticalExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager implements IBrowserActions{

    WebDriver driver;

    public void launchBrowser()
    {
        driver = new ChromeDriver();
        driver.get("https://google.com");

    }

    public void closeBrowser()
    {
        driver.quit();
    }


}
