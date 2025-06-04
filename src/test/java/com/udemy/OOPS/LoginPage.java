package com.udemy.OOPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    private By username = By.id("username"); //private webelements
    private By password = By.id("password");
    private By loginbtn = By.id("login");

    public LoginPage(WebDriver driver)    //parameterized constructor
    {
        this.driver = driver;
    }

    public void loginToRBC(String user , String pass)   //public methods
    {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginbtn).click();

    }



}
