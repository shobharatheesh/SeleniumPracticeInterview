package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_ClassSelector {

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //using css selector to locate username field

        WebElement username = driver.findElement(By.cssSelector(".form_input"));
        username.sendKeys("standard_user");

        //password field (also has the same class)
        WebElement password = driver.findElement((By.cssSelector("input[name='password")));
        password.sendKeys("secret_sauce");

        //login button has classes

        WebElement submit = driver.findElement(By.cssSelector(".submit-button"));
        submit.click();

        driver.quit();
    }
}
