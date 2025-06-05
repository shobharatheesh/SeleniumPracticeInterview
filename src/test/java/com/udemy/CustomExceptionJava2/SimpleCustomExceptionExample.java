package com.udemy.CustomExceptionJava2;

public class SimpleCustomExceptionExample {

    public static void checkNumber(int num) throws MyCustomException {

        if (num < 0) {

            throw new MyCustomException("Number can't be negative number");
        }
        else {
            System.out.println("Valid Number : "+num);
        }
    }

    public static void main(String[] args)
        {
            try {
                checkNumber(-5);
            } catch (MyCustomException e) {
                System.out.println("Caught Exception : " +e.getMessage());
            }

        }

    }

