package com.udemy.CustomExceptionJava1;

//tep 2: Use the custom exception in a program

public class TestCustomException {

    public static void validate(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or above");
        }

    }


        public static void main(String[] args)
        {
            try {
                validate(15);
            }
            catch (MyCustomException e) {
                System.out.println("Exception : " + e.getMessage());
            }


        }
    }

