package com.udemy;

import org.testng.annotations.Test;

public class TestFlowExample {

    @Test
    public void noPriority()
    {
        System.out.println("No priority and depends on Method");
    }

    @Test(priority = 1)
        public void register()
        {
            System.out.println("Register test executed");
        }

    @Test(priority = 2,dependsOnMethods = "register")
        public void login()
        {
            System.out.println("Login Test Executed");
        }

    @Test(priority =3 , dependsOnMethods = "login")
    public void addToCart()
    {
        System.out.println("Add to cart test Executed");
    }

    @Test(priority = 4 , dependsOnMethods = "addToCart")
    public void checkout()
    {
        System.out.println("Checkout test executed");
    }


    }








