package com.udemy.Exception;

public class ExceptionDemo {

    public static void checkAge(int age) throws CustomException
    {

        if(age<18)
        {
            throw new CustomException("Age must be 18+");
        }

    }

    public static void main(String[] args)
    {
         try {
             checkAge(15);
         } catch (CustomException e) {

             System.out.println("Exception Caught: " +e.getMessage());
         }
     }

    }

