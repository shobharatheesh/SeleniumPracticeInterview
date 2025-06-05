package com.udemy.CustomExceptionJava3;

public class CustomExceptionExample {

    public static void checkAge(int age) throws MyCustomException{

        if(age<18) {
            throw new MyCustomException("Age must be atleast 18");
        }
        else {
            System.out.println("Eligible to vote");

        }
    }

    public static void main(String[] args)
    {
        try {
            checkAge(19);
        } catch (MyCustomException e) {
            System.out.println("Caught Exception : " + e.getMessage());
        }


    }
}
