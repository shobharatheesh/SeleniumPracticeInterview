package com.udemy.CustomExceptionJava2;

// Step 1: Create a custom exception class

public class MyCustomException extends Exception {

    public MyCustomException(String message)
    {
        super(message);
    }
}
