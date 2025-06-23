package com.udemy;

import org.testng.annotations.Test;

public class TestPriorityExample {

        @Test(priority = 2)
        public void testLogin()
        {
            System.out.println("Login test");
        }

        @Test(priority = 1)
        public void testRegister()
            {
                System.out.println("Register test");
            }

         @Test(priority = 3)
         public void testAddCart()
         {
             System.out.println("Add to cart test");

            }
        }


