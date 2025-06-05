package com.udemy.CustomExceptionJava1;

// Step 1: Create a custom exception class

public class MyCustomException extends Exception {

    public MyCustomException(String message) {   //parameterized constructor
        super(message);

    }
}
