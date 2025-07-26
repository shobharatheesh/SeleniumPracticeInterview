package com.udemy;

public class FinallyDemo {

    public static int testMethod() {
        try {
            System.out.println("In try block");
            return 100;
        } finally {
            System.out.println("In finally block");
        }
    }

    public static void main(String[] args)
    {
        int result = testMethod();

        System.out.println("Returned Value : " +result);

    }







}




