package com.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class MultipleLinksTestng {

    //Multiple links  we can locate using <a> tag which are basically hyperlinks.

        WebDriver driver;

        @BeforeClass
        public void setUp()
    {
            driver= new ChromeDriver();

            //open website
            driver.get("https://www.google.com");
        }


        @Test
         public void findLinks() {

            //get all <a> tag elements(Links)

            List<WebElement> links = driver.findElements(By.tagName("a"));

            //print total number of links

            System.out.println("Total Links: " + links.size());

            for (WebElement link : links) {
                System.out.println("Link text: " + link.getText());
                System.out.println("URL: " + link.getAttribute("href"));
                System.out.println("===================");

            }
        }

        @AfterClass
        public void teaDown()
        {

        driver.quit();


    }
}
