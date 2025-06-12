package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CalendarDatePickerTest {

    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://demoqa.com/date-picker");

    }

    @Test
    public void selectDateFromCalendar()
    {
        WebElement inputBox = driver.findElement(By.id("datePickerMonthYearInput"));
        inputBox.click();

        List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__day--selected']"));

        for(WebElement date : dates)
        {

            if(date.getText().equals("12"));
            {
                date.click();
                break;
            }

        }

        String selectedDate = driver.findElement(By.id("datePickerMonthYearInput")).getAttribute("value");
        System.out.println("Selected Date: " +selectedDate);
    }

    @AfterClass

    public void tearDown()
    {
        driver.quit();
    }
}
