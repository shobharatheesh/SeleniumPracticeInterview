package com.udemy.OOPS;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test

    public void verifyLogin()
    {

      LoginPage loginpage  = new LoginPage(driver);
      driver.get("https://rbc.com/login");

      loginpage.loginToRBC("adminUser","adminPass");

      //add assertions for successful login

    }


}
