package com.udemy.SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StaleElementTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

    }

    @Test
    public void testStaleElementException()
    {

        //locate checkbox

        WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        //refresh the page
        driver.navigate().refresh();

        //After refresh try to click the checkbox
        try
        {
            checkbox.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException e)
        {
            System.out.println("Caught StaleElementReferenceException ");

            //Relocate the element

            checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

            checkbox.click();
        }

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
