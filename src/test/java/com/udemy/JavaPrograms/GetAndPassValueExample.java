package com.udemy.JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndPassValueExample {

    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        //type something into the first field

        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("Shobha.Rao");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //get the value from the input field
        String value = fullNameInput.getAttribute("value");
        System.out.println("Extracted value : "+value);

        //Pass the value to another field

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys(value);

        driver.quit();










    }
}
