package com.udemy;

import org.testng.annotations.Test;

public class PriorityToTestCase {

   @Test
    public void login()
    {
        System.out.println("Login Test");
    }
   @Test
    public void register()
   {
       System.out.println("Register Test");
   }

   @Test
    public void addToCart()
   {
       System.out.println("Add to the cart test");
   }
}
