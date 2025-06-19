package com.udemy.TryCatch;

public class TryWithCatchFinally {

    public static void main(String[] args)
    {
        try {
            int result = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("Handled Exception");
        }
        finally {
            System.out.println("Always Runs");
        }



    }
}
